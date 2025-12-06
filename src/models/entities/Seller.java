package models.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

    public class Seller implements Serializable {

        private Integer id;
        private String name;
        private String email;
        private LocalDate birthDate;
        private Double basesalary;

        private Department department;


        public Seller() {
        }

        public Seller(Integer id, String name, String email, LocalDate birthDate, Double baseSalary, Department department) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.birthDate = birthDate;
            this.basesalary = baseSalary;
            this.department = department;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEamil() {
            return email;
        }

        public void setEamil(String eamil) {
            this.email = eamil;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            birthDate = birthDate;
        }

        public Double getBasesalary() {
            return basesalary;
        }

        public void setBasesalary(Double basesalary) {
            this.basesalary = basesalary;
        }
        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Seller seller = (Seller) o;
            return Objects.equals(id, seller.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        @Override
        public String toString() {
            return "Seller{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", birthDate=" + birthDate +
                    ", basesalary=" + basesalary +
                    ", department=" + department +
                    '}';
        }
    }
