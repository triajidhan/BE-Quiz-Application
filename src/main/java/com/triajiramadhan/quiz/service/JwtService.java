package com.triajiramadhan.quiz.service;

import java.util.Map;

public interface JwtService {

	String generateJwt(Map<String, Object> claims);
	
	Map<String, Object> parseJwt(String token);
}
