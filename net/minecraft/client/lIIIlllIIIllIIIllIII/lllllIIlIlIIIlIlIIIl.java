package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.net.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import org.apache.commons.io.*;
import javax.imageio.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.awt.image.*;

class lllllIIlIlIIIlIlIIIl extends Thread
{
    final /* synthetic */ IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll;
    
    lllllIIlIlIIIlIlIIIl(final IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll, final String s) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(s);
    }
    
    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        IlIIlllllIIllIIlllll.lIlIlIIIllIIllIIIllI.debug("Downloading http texture from {} to {}", new Object[] { this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll });
        if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) {
            this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
        }
        else {
            try {
                httpURLConnection = (HttpURLConnection)new URL(this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll).openConnection(Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl());
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() / 100 != 2) {
                    if (httpURLConnection.getErrorStream() != null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(httpURLConnection.getErrorStream());
                    }
                    return;
                }
                BufferedImage bufferedImage;
                if (this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll != null) {
                    FileUtils.copyInputStreamToFile(httpURLConnection.getInputStream(), this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
                    bufferedImage = ImageIO.read(this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
                }
                else {
                    bufferedImage = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(httpURLConnection.getInputStream());
                }
                if (this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII != null) {
                    bufferedImage = this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(bufferedImage);
                }
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(bufferedImage);
            }
            catch (Exception ex) {
                IlIIlllllIIllIIlllll.lIlIlIIIllIIllIIIllI.error("Couldn't download http texture: " + ex.getClass().getName() + ": " + ex.getMessage());
                return;
            }
            finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        }
    }
}
