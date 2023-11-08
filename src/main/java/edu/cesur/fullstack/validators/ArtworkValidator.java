package edu.cesur.fullstack.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;



import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ArtworkValit.class)
public @interface ArtworkValidator {
	String message() default "Código inválido." 
			+ " Debe contener al menos 5 letras .";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}

