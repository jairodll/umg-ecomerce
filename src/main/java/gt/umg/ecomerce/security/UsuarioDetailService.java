package gt.umg.ecomerce.security;

//import gt.umg.ecomerce.models.usuarios;

//@Service
//public class UsuarioDetailService implements UserDetailsService {

//    @Autowired
//    private usuarioRepository repositorio;

//    @Override
//    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
//        // Recupera el usuario por correo
//        usuarios usuario = repositorio.findByCorreo(correo)
//                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + correo));
//
//        // Recupera los roles asociados al usuario
//        List<String> roles = Collections.singletonList(repositorio.findRolById(usuario.getIdUsuario()));
//        // Convierte los roles a GrantedAuthority
//        List<GrantedAuthority> authorities = roles.stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//
//        // Retorna un objeto UserDetails con los roles incluidos
//        return new User(usuario.getCorreo(), usuario.getPassword(), authorities);
//    }

//}



