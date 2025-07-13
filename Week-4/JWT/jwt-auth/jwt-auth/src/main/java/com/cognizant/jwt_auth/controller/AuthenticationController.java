package com.cognizant.jwt_auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("Start authenticate()");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String username = extractUser(authHeader);
        String token = createFakeToken(username);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        LOGGER.info("End authenticate()");
        return map;
    }

    private String extractUser(String authHeader) {
        String encoded = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        String username = decoded.split(":")[0];
        LOGGER.debug("Extracted username: {}", username);
        return username;
    }

    private String createFakeToken(String user) {
        String header = Base64.getEncoder().encodeToString("{\"alg\":\"HS256\",\"typ\":\"JWT\"}".getBytes());
        String payload = Base64.getEncoder().encodeToString(("{\"sub\":\"" + user + "\",\"iat\":" + new Date().getTime() + "}").getBytes());
        String signature = Base64.getEncoder().encodeToString("fake-signature".getBytes());

        return header + "." + payload + "." + signature;
    }
}
