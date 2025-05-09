package adaptor;

import adaptor.api.google.GoogleAdaptor;
import adaptor.api.kakao.KakaoAdaptor;

public class UserService {


    public UserProfile login(String provider, String token) {

        SocialLogin socialLogin = null;
        switch (provider.toUpperCase()) {
            case "KAKAO":
                socialLogin = new KakaoAdaptor();
                break;
            case "GOOGLE":
                socialLogin = new GoogleAdaptor();
                break;
            default:
                throw new RuntimeException("지원하지 않습니다.");
        }
        ;

        UserProfile profile = socialLogin.login(token);
        System.out.println(profile);
        return profile;


    }
}
