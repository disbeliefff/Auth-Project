package com.myprojects.authproject.service.validator;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String string) {
//        TODO: Regex to validate email
        return true;
    }
}
