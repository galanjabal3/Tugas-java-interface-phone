package phone;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
    void makePhoneScreenshoot(){
        this.phone.screenshoot();
    }
    void makePhoneMobileLegends(){
        this.phone.mobileLegends();
    }
    void makePhoneFoto(){
        this.phone.foto();
    }
    void makePhoneGaleri(){
        this.phone.galeri();
    }
    void makePhoneYouTube(){
        this.phone.youTube();
    }
}
