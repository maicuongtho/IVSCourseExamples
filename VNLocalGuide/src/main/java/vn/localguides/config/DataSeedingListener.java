package vn.localguides.config;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import vn.localguides.model.AppRole;
import vn.localguides.model.AppUser;
import vn.localguides.repository.IRoleRepository;
import vn.localguides.repository.IUserRepository;
@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    @Autowired 
    private PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        // Roles
//        if (roleRepository.findByName("ROLE_ADMIN") == null) {
//            roleRepository.save(new AppRole("ROLE_ADMIN"));
//        }
//
//        if (roleRepository.findByName("ROLE_WORKER") == null) {
//            roleRepository.save(new AppRole("ROLE_WORKER"));
//        }
//        if (roleRepository.findByName("ROLE_CLIENT") == null) {
//            roleRepository.save(new AppRole("ROLE_CLIENT"));
//        }
//
//        // Admin account
//        if (userRepository.findByEmail("admin@gmail.com") == null) {
//            AppUser admin = new AppUser();
//            admin.setEmail("admin@gmail.com");
//            admin.setPassword(passwordEncoder.encode("123456"));
//            admin.setFullname("ADMIN NAME");
//            admin.setEnabled(false);
//            admin.setSodienthoai("0000000000");
//            HashSet<AppRole> roles = new HashSet<>();
//            roles.add(roleRepository.findByName("ROLE_ADMIN"));
//            roles.add(roleRepository.findByName("ROLE_CLIENT"));
//            roles.add(roleRepository.findByName("ROLE_WORKER"));
//            admin.setRoles(roles);
//            userRepository.save(admin);
//        }
//
//        // Worker account
//        if (userRepository.findByEmail("worker@gmail.com") == null) {
//            AppUser worker = new AppUser();
//            worker.setEmail("worker@gmail.com");
//            worker.setPassword(passwordEncoder.encode("123456"));
//            worker.setFullname("WORKER NAME");
//            worker.setSodienthoai("0000000000");
//            worker.setEnabled(false);
//            HashSet<AppRole> roles = new HashSet<>();
//            roles.add(roleRepository.findByName("ROLE_WORKER"));
//            worker.setRoles(roles);
//            userRepository.save(worker);
//        }
//        
//        // Client account
//        if (userRepository.findByEmail("client@gmail.com") == null) {
//            AppUser client = new AppUser();
//            client.setEmail("client@gmail.com");
//            client.setPassword(passwordEncoder.encode("123456"));
//            client.setSodienthoai("0000000000");
//            client.setFullname("CLIENT NAME");
//            client.setEnabled(false);
//            HashSet<AppRole> roles = new HashSet<>();
//            roles.add(roleRepository.findByName("ROLE_CLIENT"));
//            client.setRoles(roles);
//            userRepository.save(client);
//        }
    }

}
