# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.bextdev.javautils.JavaUtils {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/bextdev/javautils/repack'
-flattenpackagehierarchy
-dontpreverify
