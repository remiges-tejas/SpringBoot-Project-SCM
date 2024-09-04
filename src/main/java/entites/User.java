package entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users") // Ensure the table name is as you expect
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId; // Use Long for auto-increment

    private String name;

    private String email;

    private String password;

    private String about;

    private String profilePic;

    private String phoneNumber;

    // Information
    private boolean isEnabled = false;
    private boolean emailVerified = false;
    private boolean phoneNumberVerified = false;

    // Self, Google, Github
    private Providers provider = Providers.SELF;
    private String providerUserId;
}