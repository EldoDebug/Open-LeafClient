package net.minecraft.lllIIIIlllllIlIIllIl;

import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public interface IlIlIlIlIlllllllllIl
{
    public static final Map llllIIIIlIIIlIlllIll = Maps.newHashMap();
    public static final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl = new IllIIlllIIIIlllIIlIl("dummy");
    public static final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = new IllIIlllIIIIlllIIlIl("trigger");
    public static final IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl = new IllIIlllIIIIlllIIlIl("deathCount");
    public static final IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI = new IllIIlllIIIIlllIIlIl("playerKillCount");
    public static final IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl("totalKillCount");
    public static final IlIlIlIlIlllllllllIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl("health");
    public static final IlIlIlIlIlllllllllIl[] lIIIIlIIIIIlllIllIII = { new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.llllIIIlIlllIlIIIIIl), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.lIlIlIIIllIIllIIIllI), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IIIIlllIIIIIIlIIIlll), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll), new llllIIIIlIIIlIlllIll("teamkill.", IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII) };
    public static final IlIlIlIlIlllllllllIl[] lIIIlllIIIllIIIllIII = { new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.llllIIIlIlllIlIIIIIl), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.lIlIlIIIllIIllIIIllI), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IIIIlllIIIIIIlIIIlll), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll), new llllIIIIlIIIlIlllIll("killedByTeam.", IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII) };
    
    String llllIIIIlIIIlIlllIll();
    
    int llllIIIIlIIIlIlllIll(final List p0);
    
    boolean IlIlIlIlIlllllllllIl();
    
    llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI();
}
