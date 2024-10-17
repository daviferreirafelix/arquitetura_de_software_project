package br.ifg.urutai.entity;

public class User {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private User(final String id, final String email, final String password, final String firstName, final String lastName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static UserBuilder builder(){
        return new UserBuilder();
    }
        public static class UserBuilder{
            private String id;
            private String email;
            private String password;
            private String firstName;
            private String lastName;

            UserBuilder(){

            }

            public UserBuilder id(final String id){
                this.id = id;
                return this;

            }

            public UserBuilder email(final String email){
                this.email = email;
                return this;

            }

            public UserBuilder password(final String password){
                this.password = password;
                return this;

            }


            public UserBuilder lastName(final String lastName){
                this.lastName = lastName;
                return this;
            }
            public UserBuilder firstName(final String firstName){
                this.firstName = firstName;
                return this;
            }

            public User build(){
                return new User(id,email, password,firstName,lastName);
            }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}