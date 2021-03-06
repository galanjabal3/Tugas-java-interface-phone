package phone;

public class Samsung implements Phone{

    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        // set volume asal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("SAMSUNG GALAXY");
        System.out.println("Android versi terbaru");
    }
    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphon dimatikam");
    }
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void screenshoot() {
        if (isPowerOn) {
            System.out.println("Ckriik...");
            System.out.println("Anda telah berhasil mengscreenshoot...");
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void mobileLegends() {
        if (isPowerOn) {
            System.out.println("Membuka game Mobile Legends");
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void foto() {
        if (isPowerOn) {
            System.out.println("Anda telah membuka foto/kamera");
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void galeri() {
        if (isPowerOn) {
            System.out.println("Anda telah berhasil masuk di galeri");
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void youTube() {
        if (isPowerOn) {
            System.out.println("Selamat datang di Youtube..");
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}

