DEPAL
 Writers
 Helpers
Yellow rubber duck  Rubber Duck
 Sign in or Register
{ Code Generator }
Generate code online using AI
Write a function in 	that 
el siguiente mensaje lo voy a escribir en varios tweets; ya que en uno no alcanzo; están escritos en el orden lógico con el que se escribe una pregunta con sentido completo; Como debe cambiar el software que voy a adjuntar en este mensaje; para que en vez de servir para que una constructora pueda realizar la contratación de personal; averiguando los siguientes datos: cedula, nombres y apellidos, dirección, teléfono, dirección, e_Mail; para todos los trabajos y profesiones que voy a decir después de decir los siguientes datos: si tiene al menos 3 años en el área, una edad entre 25 y 60 años para los cargos profesionales y entre 20 y 70 años para los otros empleos; se requieren dichos datos; los trabajos, profesiones y medios con los que van a trabajar son los siguientes: realizar proyectos de obra en las áreas de diseño ( para ese trabajo se requieren los siguientes profesionales: arquitectos, ingenieros civiles; realizar construcción( para ese trabajo se requieren los siguientes profesionales: maestros de obra certificados que tendrán a su cargo otros maestros de obra), bodoqueros, Operarios. de maquinaria pesada, choferes con licencia para manejar los vehículos de la empresa (estos trabajan con los siguientes medios Camionetas, volquetas, buses); el software que hace eso está en este link: https://drive.google.com/file/d/1AFgn4ukYtqVeMVuoz6gAIrWubFIaKEoN/view?usp=sharing; sirva para hacer lo siguiente: un software que en
 
  
  
/**
 * Esta función cambia el software para que sirva para hacer lo siguiente: 
 * un software que permita a una constructora realizar la contratación de personal 
 * para los trabajos y profesiones especificados, verificando los siguientes datos: 
 * cédula, nombres y apellidos, dirección, teléfono, dirección de correo electrónico, 
 * si tiene al menos 3 años en el área, una edad entre 25 y 60 años para los cargos 
 * profesionales y entre 20 y 70 años para los otros empleos.
 * 
 * @param software El software que se va a cambiar.
 * @return El software modificado.
 */
public static Software cambiarSoftware(Software software) {
    // Agregar validación de datos
    software.addValidation(new CedulaValidation());
    software.addValidation(new NombresApellidosValidation());
    software.addValidation(new DireccionValidation());
    software.addValidation(new TelefonoValidation());
    software.addValidation(new EmailValidation());
    software.addValidation(new ExperienciaValidation());
    software.addValidation(new EdadValidation());
    
    // Agregar trabajos y profesiones
    software.addJob(new ArquitectoJob());
    software.addJob(new IngenieroCivilJob());
    software.addJob(new MaestroObraJob());
    software.addJob(new BodoqueroJob());
    software.addJob(new OperarioMaquinariaPesadaJob());
    software.addJob(new ChoferJob());
    
    // Agregar medios
    software.addMedium(new CamionetaMedium());
    software.addMedium(new VolquetaMedium());
    software.addMedium(new BusMedium());
    
    return software;
}