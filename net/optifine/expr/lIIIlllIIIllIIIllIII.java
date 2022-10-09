package net.optifine.expr;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.util.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public enum lIIIlllIIIllIIIllIII
{
    llllIIIIlIIIlIlllIll("PLUS", 0, 10, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "+", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIlIlIlIlllllllllIl("MINUS", 1, 10, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "-", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llIllIIIIIllIlIIIIlI("MUL", 2, 11, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "*", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIIIlIlIIIllIlIlIIl("DIV", 3, 11, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "/", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIlIIIllIllIIIIIllI("MOD", 4, 11, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "%", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IllIIlllIIIIlllIIlIl("NEG", 5, 12, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "neg", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llllIIIlIlllIlIIIIIl("PI", 6, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "pi", new IlIlIIIllIllIIIIIllI[0]), 
    lIIIIlIIIIIlllIllIII("SIN", 7, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "sin", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    lIIIlllIIIllIIIllIII("COS", 8, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "cos", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llIIlIIIlIIIllIlIIIl("ASIN", 9, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "asin", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llIllIlIIIIllIlIIllI("ACOS", 10, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "acos", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    lIlIlIIIllIIllIIIllI("TAN", 11, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "tan", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIlIIIllIIllIlllllI("ATAN", 12, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "atan", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIIIlllIIIIIIlIIIlll("ATAN2", 13, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "atan2", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llllIIllllIlIlIIIIll("TORAD", 14, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "torad", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIllIlIlIIIlIlIlIII("TODEG", 15, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "todeg", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIlllIIlIllIllIlIIll("MIN", 16, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "min", (IlIllIlIlIIIlIlIlIII)new lllIIIIlllllIlIIllIl().llllIIIIlIIIlIlllIll(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)), 
    lllIIIIlllllIlIIllIl("MAX", 17, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "max", (IlIllIlIlIIIlIlIlIII)new lllIIIIlllllIlIIllIl().llllIIIIlIIIlIlllIll(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)), 
    IlIlIIIIIIlllIlIllIl("CLAMP", 18, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "clamp", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIllIIllIIIlIlIIIIlI("ABS", 19, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "abs", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIIlIIIlIlIIlllIIlll("FLOOR", 20, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "floor", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIlIIIlIIlIlIIlllIl("CEIL", 21, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "ceil", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlllllllIIIlIIIlIlII("EXP", 22, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "exp", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIlIIIIlllIlllllIlII("FRAC", 23, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "frac", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIIlIIlIIIIlllIlllII("LOG", 24, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "log", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIlIllllllllIIIIlII("POW", 25, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "pow", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIlllIlIIllIlIlIlIIl("RANDOM", 26, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "random", new IlIlIIIllIllIIIIIllI[0]), 
    llIIIlIlIllIIlIlIlII("ROUND", 27, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "round", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    lllllIlIIIlIlIIlllII("SIGNUM", 28, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "signum", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    lIllllllIIllIlIlIlII("SQRT", 29, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "sqrt", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llIIlllIIlllIIllIllI("FMOD", 30, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "fmod", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIlllIIIlIlllIIlllII("TIME", 31, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "time", new IlIlIIIllIllIIIIIllI[0]), 
    IIlIIIIIllIlIIIlIIll("IF", 32, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "if", (IlIllIlIlIIIlIlIlIII)new lllIIIIlllllIlIIllIl().llllIIIIlIIIlIlllIll(net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)), 
    llllllIllIllIlIllllI("NOT", 33, 12, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "!", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI }), 
    IIIllllllIllIIIlllIl("AND", 34, 3, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "&&", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI }), 
    IlIIIlIIIllllIlIlIlI("OR", 35, 2, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "||", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI }), 
    IIIIIllIIIIlIIIIllIl("GREATER", 36, 8, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, ">", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIIIIIIIIlllIllIlIlI("GREATER_OR_EQUAL", 37, 8, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, ">=", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIllllIIIlIIIIIIllIl("SMALLER", 38, 8, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "<", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlllIIIIlIIIlIlIlIIl("SMALLER_OR_EQUAL", 39, 8, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "<=", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    lllIllIIIllllllIllll("EQUAL", 40, 7, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "==", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    llIllIlIlIIIIIIIllII("NOT_EQUAL", 41, 7, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "!=", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIlIlIlIIlIllIIIIIIl("BETWEEN", 42, 7, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "between", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IllIllIIIIlIIlIlllII("EQUALS", 43, 7, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "equals", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IlIllllIIlIIlIlIlIll("IN", 44, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "in", (IlIllIlIlIIIlIlIlIII)new lllIIIIlllllIlIIllIl().llllIIIIlIIIlIlllIll(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)), 
    IllIllIlllIllllIIllI("SMOOTH", 45, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "smooth", (IlIllIlIlIIIlIlIlIII)new lllIIIIlllllIlIIllIl().llllIIIIlIIIlIlllIll(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(4)), 
    llIlIIIIIlIIlIlIIlll("TRUE", 46, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "true", new IlIlIIIllIllIIIIIllI[0]), 
    IlIIlIlIIIlIIlIlIlII("FALSE", 47, net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, "false", new IlIlIIIllIllIIIIIllI[0]), 
    IllIlIIllIllIIlIllII("VEC2", 48, net.optifine.expr.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, "vec2", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    lIIlIIIlIllIlIllIIIl("VEC3", 49, net.optifine.expr.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, "vec3", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll }), 
    IIlIIIlllIllIllIlIII("VEC4", 50, net.optifine.expr.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, "vec4", new IlIlIIIllIllIIIIIllI[] { net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll });
    
    private int llIIIIIIlIllIIlIIIll;
    private IlIlIIIllIllIIIIIllI lIIIIlIlIllllIIlIllI;
    private String llIIIlIlllIllIIlIllI;
    private IlIllIlIlIIIlIlIlIII IlIIllIIllIIllIIlIIl;
    public static lIIIlllIIIllIIIllIII[] lIlIlIlllIIlIlIlllIl;
    private static final Map lllllIIIIIlIlIIIIIIl;
    private static volatile /* synthetic */ int[] IllIIlllllIIllIIllIl;
    
    static {
        lIllIIIIIlllIIlIIllI = new lIIIlllIIIllIIIllIII[] { lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll, lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl, lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl, lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl, lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII, lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII, lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl, lIIIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI, lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI, lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI, lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll, lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll, lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII, lIIIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll, lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl, lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl, lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI, lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll, lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl, lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII, lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII, lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII, lIIIlllIIIllIIIllIII.IIlllIlIIllIlIlIlIIl, lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII, lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII, lIIIlllIIIllIIIllIII.lIllllllIIllIlIlIlII, lIIIlllIIIllIIIllIII.llIIlllIIlllIIllIllI, lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII, lIIIlllIIIllIIIllIII.IIlIIIIIllIlIIIlIIll, lIIIlllIIIllIIIllIII.llllllIllIllIlIllllI, lIIIlllIIIllIIIllIII.IIIllllllIllIIIlllIl, lIIIlllIIIllIIIllIII.IlIIIlIIIllllIlIlIlI, lIIIlllIIIllIIIllIII.IIIIIllIIIIlIIIIllIl, lIIIlllIIIllIIIllIII.IIIIIIIIIlllIllIlIlI, lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl, lIIIlllIIIllIIIllIII.IlllIIIIlIIIlIlIlIIl, lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll, lIIIlllIIIllIIIllIII.llIllIlIlIIIIIIIllII, lIIIlllIIIllIIIllIII.IIlIlIlIIlIllIIIIIIl, lIIIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII, lIIIlllIIIllIIIllIII.IlIllllIIlIIlIlIlIll, lIIIlllIIIllIIIllIII.IllIllIlllIllllIIllI, lIIIlllIIIllIIIllIII.llIlIIIIIlIIlIlIIlll, lIIIlllIIIllIIIllIII.IlIIlIlIIIlIIlIlIlII, lIIIlllIIIllIIIllIII.IllIlIIllIllIIlIllII, lIIIlllIIIllIIIllIII.lIIlIIIlIllIlIllIIIl, lIIIlllIIIllIIIllIII.IIlIIIlllIllIllIlIII };
        lIIIlllIIIllIIIllIII.lIlIlIlllIIlIlIlllIl = values();
        lllllIIIIIlIlIIIIIIl = new HashMap();
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final String s2, final IlIlIIIllIllIIIIIllI[] array) {
        this(s, n, 0, ilIlIIIllIllIIIIIllI, s2, array);
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final int n2, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final String s2, final IlIlIIIllIllIIIIIllI[] array) {
        this(s, n, n2, ilIlIIIllIllIIIIIllI, s2, new IIlllIIlIllIllIlIIll(array));
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final String s2, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        this(s, n, 0, ilIlIIIllIllIIIIIllI, s2, ilIllIlIlIIIlIlIlIII);
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final int llIIIIIIlIllIIlIIIll, final IlIlIIIllIllIIIIIllI liiiIlIlIllllIIlIllI, final String llIIIlIlllIllIIlIllI, final IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl) {
        this.llIIIIIIlIllIIlIIIll = llIIIIIIlIllIIlIIIll;
        this.lIIIIlIlIllllIIlIllI = liiiIlIlIllllIIlIllI;
        this.llIIIlIlllIllIIlIllI = llIIIlIlllIllIIlIllI;
        this.IlIIllIIllIIllIIlIIl = ilIIllIIllIIllIIlIIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llIIIlIlllIllIIlIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIIIIIIlIllIIlIIIll;
    }
    
    public IlIlIIIllIllIIIIIllI llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIlIllllIIlIllI;
    }
    
    public IlIllIlIlIIIlIlIlIII IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIllIIllIIllIIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl[] array) {
        return this.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(array).length;
    }
    
    public IlIlIIIllIllIIIIIllI[] IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl[] array) {
        return this.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(array);
    }
    
    public float llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl[] array) {
        switch (IlIlIIIllIllIIIIIllI()[this.ordinal()]) {
            case 1: {
                return llllIIIIlIIIlIlllIll(array, 0) + llllIIIIlIIIlIlllIll(array, 1);
            }
            case 2: {
                return llllIIIIlIIIlIlllIll(array, 0) - llllIIIIlIIIlIlllIll(array, 1);
            }
            case 3: {
                return llllIIIIlIIIlIlllIll(array, 0) * llllIIIIlIIIlIlllIll(array, 1);
            }
            case 4: {
                return llllIIIIlIIIlIlllIll(array, 0) / llllIIIIlIIIlIlllIll(array, 1);
            }
            case 5: {
                final float llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array, 0);
                final float llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(array, 1);
                return llllIIIIlIIIlIlllIll - llllIIIIlIIIlIlllIll2 * (int)(llllIIIIlIIIlIlllIll / llllIIIIlIIIlIlllIll2);
            }
            case 6: {
                return -llllIIIIlIIIlIlllIll(array, 0);
            }
            case 7: {
                return llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
            }
            case 8: {
                return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 9: {
                return llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 10: {
                return net.optifine.util.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 11: {
                return net.optifine.util.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 12: {
                return (float)Math.tan(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 13: {
                return (float)Math.atan(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 14: {
                return (float)llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1));
            }
            case 15: {
                return net.optifine.util.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 16: {
                return net.optifine.util.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 17: {
                return this.IllIIlllIIIIlllIIlIl(array);
            }
            case 18: {
                return this.llllIIIlIlllIlIIIIIl(array);
            }
            case 19: {
                return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1), llllIIIIlIIIlIlllIll(array, 2));
            }
            case 20: {
                return llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 23: {
                return (float)Math.exp(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 21: {
                return (float)llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 22: {
                return (float)llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 24: {
                return (float)llIllIIlllllllllllll.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 25: {
                return (float)Math.log(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 26: {
                return (float)Math.pow(llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1));
            }
            case 27: {
                return (float)Math.random();
            }
            case 28: {
                return (float)Math.round(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 29: {
                return Math.signum(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 30: {
                return llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll(array, 0));
            }
            case 31: {
                final float llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(array, 0);
                final float llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(array, 1);
                return llllIIIIlIIIlIlllIll3 - llllIIIIlIIIlIlllIll4 * llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll3 / llllIIIIlIIIlIlllIll4);
            }
            case 32: {
                final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = Minecraft.getMinecraft().IllIIlllIIIIlllIIlIl;
                if (illIIlllIIIIlllIIlIl == null) {
                    return 0.0f;
                }
                return illIIlllIIIIlllIIlIl.IIIlIIlIIIIlllIlllII() % 24000L + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI;
            }
            case 33: {
                final int n = (array.length - 1) / 2;
                for (int i = 0; i < n; ++i) {
                    final int n2 = i * 2;
                    if (IlIlIlIlIlllllllllIl(array, n2)) {
                        return llllIIIIlIIIlIlllIll(array, n2 + 1);
                    }
                }
                return llllIIIIlIIIlIlllIll(array, n * 2);
            }
            case 46: {
                final int n3 = (int)llllIIIIlIIIlIlllIll(array, 0);
                final float llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll(array, 1);
                final float n4 = (array.length > 2) ? llllIIIIlIIIlIlllIll(array, 2) : 1.0f;
                return net.optifine.shaders.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n3, llllIIIIlIIIlIlllIll5, n4, (array.length > 3) ? llllIIIIlIIIlIlllIll(array, 3) : n4);
            }
            default: {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown function type: " + this);
                return 0.0f;
            }
        }
    }
    
    private float IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl[] array) {
        if (array.length == 2) {
            return Math.min(llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1));
        }
        float llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array, 0);
        for (int i = 1; i < array.length; ++i) {
            final float llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(array, i);
            if (llllIIIIlIIIlIlllIll2 < llllIIIIlIIIlIlllIll) {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private float llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl[] array) {
        if (array.length == 2) {
            return Math.max(llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1));
        }
        float llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array, 0);
        for (int i = 1; i < array.length; ++i) {
            final float llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(array, i);
            if (llllIIIIlIIIlIlllIll2 > llllIIIIlIIIlIlllIll) {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private static float llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl[] array, final int n) {
        return ((IlIlIIIllIIllIlllllI)array[n]).IlIlIlIlIlllllllllIl();
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl[] array) {
        switch (IlIlIIIllIllIIIIIllI()[this.ordinal()]) {
            case 47: {
                return true;
            }
            case 48: {
                return false;
            }
            case 34: {
                return !IlIlIlIlIlllllllllIl(array, 0);
            }
            case 35: {
                return IlIlIlIlIlllllllllIl(array, 0) && IlIlIlIlIlllllllllIl(array, 1);
            }
            case 36: {
                return IlIlIlIlIlllllllllIl(array, 0) || IlIlIlIlIlllllllllIl(array, 1);
            }
            case 37: {
                return llllIIIIlIIIlIlllIll(array, 0) > llllIIIIlIIIlIlllIll(array, 1);
            }
            case 38: {
                return llllIIIIlIIIlIlllIll(array, 0) >= llllIIIIlIIIlIlllIll(array, 1);
            }
            case 39: {
                return llllIIIIlIIIlIlllIll(array, 0) < llllIIIIlIIIlIlllIll(array, 1);
            }
            case 40: {
                return llllIIIIlIIIlIlllIll(array, 0) <= llllIIIIlIIIlIlllIll(array, 1);
            }
            case 41: {
                return llllIIIIlIIIlIlllIll(array, 0) == llllIIIIlIIIlIlllIll(array, 1);
            }
            case 42: {
                return llllIIIIlIIIlIlllIll(array, 0) != llllIIIIlIIIlIlllIll(array, 1);
            }
            case 43: {
                final float llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(array, 0);
                return llllIIIIlIIIlIlllIll >= llllIIIIlIIIlIlllIll(array, 1) && llllIIIIlIIIlIlllIll <= llllIIIIlIIIlIlllIll(array, 2);
            }
            case 44: {
                return Math.abs(llllIIIIlIIIlIlllIll(array, 0) - llllIIIIlIIIlIlllIll(array, 1)) <= llllIIIIlIIIlIlllIll(array, 2);
            }
            case 45: {
                final float llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(array, 0);
                for (int i = 1; i < array.length; ++i) {
                    if (llllIIIIlIIIlIlllIll2 == llllIIIIlIIIlIlllIll(array, i)) {
                        return true;
                    }
                }
                return false;
            }
            default: {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown function type: " + this);
                return false;
            }
        }
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl[] array, final int n) {
        return ((llIllIlIIIIllIlIIllI)array[n]).llIllIIIIIllIlIIIIlI();
    }
    
    public float[] IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl[] array) {
        switch (IlIlIIIllIllIIIIIllI()[this.ordinal()]) {
            case 49: {
                return new float[] { llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1) };
            }
            case 50: {
                return new float[] { llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1), llllIIIIlIIIlIlllIll(array, 2) };
            }
            case 51: {
                return new float[] { llllIIIIlIIIlIlllIll(array, 0), llllIIIIlIIIlIlllIll(array, 1), llllIIIIlIIIlIlllIll(array, 2), llllIIIIlIIIlIlllIll(array, 3) };
            }
            default: {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown function type: " + this);
                return null;
            }
        }
    }
    
    public static lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final String s) {
        for (int i = 0; i < lIIIlllIIIllIIIllIII.lIlIlIlllIIlIlIlllIl.length; ++i) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = lIIIlllIIIllIIIllIII.lIlIlIlllIIlIlIlllIl[i];
            if (liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll().equals(s)) {
                return liiIlllIIIllIIIllIII;
            }
        }
        return null;
    }
    
    static /* synthetic */ int[] IlIlIIIllIllIIIIIllI() {
        final int[] illIIlllllIIllIIllIl = lIIIlllIIIllIIIllIII.IllIIlllllIIllIIllIl;
        if (illIIlllllIIllIIllIl != null) {
            return illIIlllllIIllIIllIl;
        }
        final int[] illIIlllllIIllIIllIl2 = new int[values().length];
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIIllllllIllIIIlllIl.ordinal()] = 35;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlIlIlIIlIllIIIIIIl.ordinal()] = 43;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll.ordinal()] = 41;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII.ordinal()] = 44;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIIlIlIIIlIIlIlIlII.ordinal()] = 48;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIIlllIIlllIIllIllI.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIIIIllIIIIlIIIIllIl.ordinal()] = 37;
        }
        catch (NoSuchFieldError noSuchFieldError19) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIIIIIIIIlllIllIlIlI.ordinal()] = 38;
        }
        catch (NoSuchFieldError noSuchFieldError20) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlIIIIIllIlIIIlIIll.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError21) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIllllIIlIIlIlIlIll.ordinal()] = 45;
        }
        catch (NoSuchFieldError noSuchFieldError22) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError23) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError24) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError25) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError26) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError27) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError28) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError29) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llllllIllIllIlIllllI.ordinal()] = 34;
        }
        catch (NoSuchFieldError noSuchFieldError30) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIllIlIlIIIIIIIllII.ordinal()] = 42;
        }
        catch (NoSuchFieldError noSuchFieldError31) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIIIlIIIllllIlIlIlI.ordinal()] = 36;
        }
        catch (NoSuchFieldError noSuchFieldError32) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError33) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError34) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError35) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlllIlIIllIlIlIlIIl.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError36) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError37) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError38) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError39) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl.ordinal()] = 39;
        }
        catch (NoSuchFieldError noSuchFieldError40) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlllIIIIlIIIlIlIlIIl.ordinal()] = 40;
        }
        catch (NoSuchFieldError noSuchFieldError41) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IllIllIlllIllllIIllI.ordinal()] = 46;
        }
        catch (NoSuchFieldError noSuchFieldError42) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lIllllllIIllIlIlIlII.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError43) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError44) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError45) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError46) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError47) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.llIlIIIIIlIIlIlIIlll.ordinal()] = 47;
        }
        catch (NoSuchFieldError noSuchFieldError48) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IllIlIIllIllIIlIllII.ordinal()] = 49;
        }
        catch (NoSuchFieldError noSuchFieldError49) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.lIIlIIIlIllIlIllIIIl.ordinal()] = 50;
        }
        catch (NoSuchFieldError noSuchFieldError50) {}
        try {
            illIIlllllIIllIIllIl2[lIIIlllIIIllIIIllIII.IIlIIIlllIllIllIlIII.ordinal()] = 51;
        }
        catch (NoSuchFieldError noSuchFieldError51) {}
        return lIIIlllIIIllIIIllIII.IllIIlllllIIllIIllIl = illIIlllllIIllIIllIl2;
    }
}
