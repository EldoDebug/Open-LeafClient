package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import tv.twitch.broadcast.*;
import net.minecraft.client.IlIlIIIllIIllIlllllI.*;

class IlIlIlIlIlllllllllIl extends lllIIIIlIlIllIIlIIIl
{
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Minecraft minecraft) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(minecraft, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, 32, llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII - 35, (int)(minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll * 3.5));
        this.IlIlIlIlIlllllllllIl(false);
    }
    
    @Override
    protected int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl().IlIlIIIIIIlllIlIllIl().length;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final boolean b, final int n2, final int n3) {
        this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.IllIllIIIIlIIlIlllII = this.llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl().IlIlIIIIIIlllIlIllIl()[n].serverUrl;
        this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final int n) {
        return this.llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl().IlIlIIIIIIlllIlIllIl()[n].serverUrl.equals(this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.IllIllIIIIlIIlIlllII);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl() {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        final IngestServer ingestServer = this.llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl().IlIlIIIIIIlllIlIllIl()[n];
        String s = ingestServer.serverUrl.replaceAll("\\{stream_key\\}", "");
        String s2 = String.valueOf((int)ingestServer.bitrateKbps) + " kbps";
        String s3 = null;
        final llllIIllllIlIlIIIIll iiIlIIIlIlIIlllIIlll = this.llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl().IIIlIIIlIlIIlllIIlll();
        if (iiIlIIIlIlIIlllIIlll != null) {
            if (ingestServer == iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll()) {
                s = IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI + s;
                s2 = String.valueOf((int)(iiIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl() * 100.0f)) + "%";
            }
            else if (n < iiIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl()) {
                if (ingestServer.bitrateKbps == 0.0f) {
                    s2 = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Down!";
                }
            }
            else {
                s2 = IlllIIIIlIIIlIlIlIIl.IIlllIIlIllIllIlIIll + "1234" + IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl + " kbps";
            }
        }
        else if (ingestServer.bitrateKbps == 0.0f) {
            s2 = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + "Down!";
        }
        n2 -= 15;
        if (this.llllIIIIlIIIlIlllIll(n)) {
            s3 = IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl + "(Preferred)";
        }
        else if (ingestServer.defaultServer) {
            s3 = IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI + "(Default)";
        }
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, ingestServer.serverName, n2 + 2, n3 + 5, 16777215);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s, n2 + 2, n3 + this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll + 5 + 3, 3158064);
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s2, this.llllIIIlIlllIlIIIIIl() - 5 - this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s2), n3 + 5, 8421504);
        if (s3 != null) {
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, s3, this.llllIIIlIlllIlIIIIIl() - 5 - this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s3), n3 + 5 + 3 + this.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 8421504);
        }
    }
    
    @Override
    protected int llllIIIlIlllIlIIIIIl() {
        return super.llllIIIlIlllIlIIIIIl() + 15;
    }
}
