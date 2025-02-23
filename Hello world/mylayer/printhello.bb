DESCRIPTION = "Prints Hello World"
PN = 'printhello'
PV = '1'

python do_build() {
   bb.plain("**********************************");
   bb.plain("*                                *");
   bb.plain("*  Hello From  YOCTO Project !   *");
   bb.plain("*                                *");
   bb.plain("**********************************");
}
