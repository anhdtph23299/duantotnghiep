package com.laptrinhjavaweb.config;

import java.util.Optional;

import com.laptrinhjavaweb.dto.MyUserDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {
	
	@Bean
	public AuditorAware<String> auditorProvider() {
		return new AuditorAwareImpl();
	}
	
	public static class AuditorAwareImpl implements AuditorAware<String> {

		@Override
		public Optional<String> getCurrentAuditor() {
			MyUserDetail myUserDetail = (MyUserDetail) (SecurityContextHolder
					.getContext()).getAuthentication().getPrincipal();
			if (myUserDetail == null) {
				return null;
			}
			return Optional.of(myUserDetail.getUsername());
		}
	}
}
