class User {
    private String username;
    private String email;
    private String phone;

    public static class UserBuilder {
        private String username;
        private String email;
        private String phone;

        public UserBuilder(String username) {
            this.username = username;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            User user = new User();
            user.username = this.username;
            user.email = this.email;
            user.phone = this.phone;
            return user;
        }
    }
}
