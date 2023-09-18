1) Which of the following is defined as the process of converting data from one form to another with out any secret involved and has nothing to do with cryptography ?
   Encoding(Not Encryption or cryptography)
2) Which of the following statement related to Encoding is TRUE ?

3) Which of the following technique is recommended while handling passwords inside web applications?
   Hashing (Over encoding and Encryption)
4) What is the interface provided by Spring Security to support password encoding ?
   import org.springframework.security.crypto.password.PasswordEncoder;
5) Which of the following PasswordEncoder implementations can be considered for testing, when working with plain text passwords may be preferred?
   import org.springframework.security.crypto.password.NoOpPasswordEncoder;
6) Which of the following PasswordEncoders is recommended for production usage?
   import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
7) 