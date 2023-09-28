//package com.springsecurity.config;
//
//import com.springsecurity.filter.ApiKeyAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//
////    @Override
////    public void configure(HttpSecurity http) throws Exception {
////        http.oauth2Login()
////                .authorizationEndpoint()
////                .baseUri("/login/oauth2/authorization")
////                .and()
////                .defaultSuccessURL("/login/success")
////                .and()
////                .tokenEndpoint()
////                .accessTokenResponseClient(new CustomAccessTokenResponseClient())
////                .and()
////                .userInfoEndpoint()
////                .userService(new CustomOAuth2UserService());
////    }
//
//    @Autowired
//    private ApiKeyAuthenticationFilter apiKeyAuthenticationFilter;
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.addFilterBefore(apiKeyAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests(
//                        request -> request.requestMatchers("/**").permitAll().and()
//                )
//                // Configure authorization rules for your endpoints
//
//                .csrf().disable()
//                .httpBasic().disable();
//    }
//}
