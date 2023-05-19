this code is not working like i expect — how do i fix it?

resultWorkerErr := make(chan error)
defer close(resultWorkerErr)
go func() {
	defer cancel()
	resultWorkerErr <- b.resultWorker(ctx)
}()

err := b.worker(ctx)
cancel()
if err == nil {
	return <-resultWorkerErr
}
return multierror.Append(err, <-resultWorkerErr)