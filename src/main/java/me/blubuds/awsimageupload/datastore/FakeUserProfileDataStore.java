package me.blubuds.awsimageupload.datastore;

import me.blubuds.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("9fbacfee-de57-4960-b1c5-3e9ce617ba47"), "LeeKH", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("c2c95906-7e3f-4d83-b6c2-ca8269ceabde"), "ChoSE", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
