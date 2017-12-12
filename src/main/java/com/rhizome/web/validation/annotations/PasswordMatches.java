package com.rhizome.web.validation.annotations;

import com.rhizome.web.validation.validators.PasswordMatchesValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
public @interface PasswordMatches {

    String passwordField() default "password";

    String confirmationField() default "confirmationPassword";

    String message() default "passwords-do-not-match";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
