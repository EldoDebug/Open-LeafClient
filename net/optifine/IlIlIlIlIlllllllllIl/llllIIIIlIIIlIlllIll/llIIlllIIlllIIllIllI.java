package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class llIIlllIIlllIIllIllI extends lIIIIlIIIIIlllIllIII
{
    private static Map llllIIIIlIIIlIlllIll;
    
    static {
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll = null;
    }
    
    public llIIlllIIlllIIllIllI() {
        super(IllIIlllIIIIlllIIlIl.class, "horse", 0.75f);
    }
    
    protected llIIlllIIlllIIllIllI(final Class clazz, final String s, final float n) {
        super(clazz, s, n);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        return new IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IIIlIIIlIlIIlllIIlll)) {
            return null;
        }
        final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = (IIIlIIIlIlIIlllIIlll)ilIIIlIlIIIllIlIlIIl;
        final Map llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl();
        if (llllIIIlIlllIlIIIIIl.containsKey(s)) {
            return (IIlIIIIIllIlIIIlIIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bL, llllIIIlIlllIlIIIIIl.get(s));
        }
        return null;
    }
    
    @Override
    public String[] IllIIlllIIIIlllIIlIl() {
        return new String[] { "head", "upper_mouth", "lower_mouth", "horse_left_ear", "horse_right_ear", "mule_left_ear", "mule_right_ear", "neck", "horse_face_ropes", "mane", "body", "tail_base", "tail_middle", "tail_tip", "back_left_leg", "back_left_shin", "back_left_hoof", "back_right_leg", "back_right_shin", "back_right_hoof", "front_left_leg", "front_left_shin", "front_left_hoof", "front_right_leg", "front_right_shin", "front_right_hoof", "mule_left_chest", "mule_right_chest", "horse_saddle_bottom", "horse_saddle_front", "horse_saddle_back", "horse_left_saddle_rope", "horse_left_saddle_metal", "horse_right_saddle_rope", "horse_right_saddle_metal", "horse_left_face_metal", "horse_right_face_metal", "horse_left_rein", "horse_right_rein" };
    }
    
    private static Map llllIIIlIlllIlIIIIIl() {
        if (llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll != null) {
            return llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll;
        }
        (llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll = new HashMap()).put("head", 0);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("upper_mouth", 1);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("lower_mouth", 2);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_left_ear", 3);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_right_ear", 4);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("mule_left_ear", 5);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("mule_right_ear", 6);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("neck", 7);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_face_ropes", 8);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("mane", 9);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("body", 10);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("tail_base", 11);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("tail_middle", 12);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("tail_tip", 13);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("back_left_leg", 14);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("back_left_shin", 15);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("back_left_hoof", 16);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("back_right_leg", 17);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("back_right_shin", 18);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("back_right_hoof", 19);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("front_left_leg", 20);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("front_left_shin", 21);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("front_left_hoof", 22);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("front_right_leg", 23);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("front_right_shin", 24);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("front_right_hoof", 25);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("mule_left_chest", 26);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("mule_right_chest", 27);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_saddle_bottom", 28);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_saddle_front", 29);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_saddle_back", 30);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_left_saddle_rope", 31);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_left_saddle_metal", 32);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_right_saddle_rope", 33);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_right_saddle_metal", 34);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_left_face_metal", 35);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_right_face_metal", 36);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_left_rein", 37);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.put("horse_right_rein", 38);
        return llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        return new IIIlIIlIIIIlllIlllII(Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl(), (IIIlIIIlIlIIlllIIlll)ilIIIlIlIIIllIlIlIIl, n);
    }
}
