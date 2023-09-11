


2) Which of the following is the correct code to create the bean of SecurityFilterChain to define custom security configurations ?
   @Bean
   SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    
   }
</br>
3) Which of the following is the default behaviour or configurations that Spring Security follows for our application endpoints?

   @Bean
   @Order(SecurityProperties.BASIC_AUTH_ORDER)
   SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
      http.authorizeHttpRequests().anyRequest().authenticated();
      http.formLogin();
       http.httpBasic();
       return http.build();
   }

4) If I have a below requirement to secure my application endpoints, which of the following configuration is correct?

"/dashboard" - Secured

"/myProfile" - Secured

"/home" - Not Secured

5) Which of the following configuration is correct to not allow anyone accessing the endpoints regardless of successfully authenticated or not?
   /**
   *  Configuration to deny all the requests
      */
      /*http.authorizeHttpRequests(requests -> requests.anyRequest().denyAll())
      .formLogin(Customizer.withDefaults())
      .httpBasic(Customizer.withDefaults());
      return http.build();*/
  

6) Which of the following configuration is correct to allow anyone accessing the endpoints regardless of successfully authenticated or not?
   *  Configuration to permit all the requests
      */
      /*http.authorizeHttpRequests(requests -> requests.anyRequest().permitAll())
      .formLogin(Customizer.withDefaults())
      .httpBasic(Customizer.withDefaults());
      return http.build();*/
      }