package net.optifine.lIIIIlIIIIIlllIllIII;

import java.lang.reflect.*;
import net.minecraft.client.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll implements IllIIlllIIIIlllIIlIl
{
    @Override
    public Field llllIIIIlIIIlIlllIll() {
        final Class<Minecraft> clazz = Minecraft.class;
        final Field ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("(Reflector) Field not present: " + clazz.getName() + ".actionKeyF3 (field renderChunksMany not found)");
            return null;
        }
        final Field llllIIIIlIIIlIlllIll = IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(Minecraft.class, ilIlIlIlIlllllllllIl, Boolean.TYPE, 0);
        if (llllIIIIlIIIlIlllIll == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("(Reflector) Field not present: " + clazz.getName() + ".actionKeyF3");
            return null;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private Field IlIlIlIlIlllllllllIl() {
        final Minecraft minecraft = Minecraft.getMinecraft();
        final boolean llllllIllIllIlIllllI = minecraft.llllllIllIllIlIllllI;
        final Field[] declaredFields = Minecraft.class.getDeclaredFields();
        minecraft.llllllIllIllIlIllllI = true;
        final Field[] llllIIIIlIIIlIlllIll = IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(minecraft, declaredFields, Boolean.TYPE, Boolean.TRUE);
        minecraft.llllllIllIllIlIllllI = false;
        final Field[] llllIIIIlIIIlIlllIll2 = IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(minecraft, declaredFields, Boolean.TYPE, Boolean.FALSE);
        minecraft.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
        final HashSet set = new HashSet<Object>(Arrays.asList(llllIIIIlIIIlIlllIll));
        final HashSet set2 = new HashSet(Arrays.asList(llllIIIIlIIIlIlllIll2));
        final HashSet set3 = new HashSet(set);
        set3.retainAll(set2);
        final Field[] array = (Field[])set3.toArray((Object[])new Field[set3.size()]);
        return (array.length != 1) ? null : array[0];
    }
}
