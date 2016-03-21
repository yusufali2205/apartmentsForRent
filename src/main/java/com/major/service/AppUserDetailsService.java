package com.major.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.major.model.User;
import com.major.repo.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {
  
  @Autowired
  private UserRepository userRepo;
  
  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userRepo.findByEmail(email);
    if(user == null) throw new UsernameNotFoundException("That user doesn't exist");
    return user;
  }

}
