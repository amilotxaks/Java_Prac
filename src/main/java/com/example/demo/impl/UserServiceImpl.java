package com.example.demo.impl;
import com.example.demo.enity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	@Override
	public User getUser(int id) {
		return userRepository.findById(id).orElse(null);
	}
}

