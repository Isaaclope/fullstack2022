

@Controller
public class Controlador {
// para peticiones GET en la ruta /formulario
@GetMapping("/formulario")
public String mostrarFormulario() {
return "formulario-hola";
}
// para peticiones POST en la ruta /formulario
@PostMapping("/formulario")
public String procesarFormulario(HttpServletRequest request, Model model) {
String nombre = request.getParameter("nombre");
String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase();
System.out.println("El valor enviado por el usuario es " + mensaje);
model.addAttribute("mensaje", mensaje);
return "hola";
}
}