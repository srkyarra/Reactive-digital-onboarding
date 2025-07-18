package org.example.Onboarding;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "customers")
public class Model {
        @Id
        private String id;
        private String name;
        private String email;
        private String phone;
        private String kycStatus;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getKycStatus() {
                return kycStatus;
        }

        public void setKycStatus(String kycStatus) {
                this.kycStatus = kycStatus;
        }
}

