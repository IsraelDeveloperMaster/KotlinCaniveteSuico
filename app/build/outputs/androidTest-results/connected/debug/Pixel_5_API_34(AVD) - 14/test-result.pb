
Ç,
u
FragmentHomeTest4net.developermaster.kotlincanivetesuico.ui.home.viewverificar_posicao2ƒ³Íº€µ·I:‡³ÍºÀÐ¼gî#
ãjava.lang.NoClassDefFoundError: Failed resolution of: Lorg/hamcrest/Matchers;
at androidx.test.espresso.matcher.ViewMatchers.withId(ViewMatchers.java:248)
at net.developermaster.kotlincanivetesuico.ui.home.view.FragmentHomeTest$verificar_posicao$1.invokeSuspend(FragmentHomeTest.kt:36)
at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:104)
at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:277)
at kotlinx.coroutines.BlockingCoroutine.joinBlocking(Builders.kt:95)
at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(Builders.kt:69)
at kotlinx.coroutines.BuildersKt.runBlocking(Unknown Source:1)
at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(Builders.kt:48)
at kotlinx.coroutines.BuildersKt.runBlocking$default(Unknown Source:1)
at net.developermaster.kotlincanivetesuico.ui.home.view.FragmentHomeTest.verificar_posicao(FragmentHomeTest.kt:34)
... 33 trimmed
Caused by: java.lang.ClassNotFoundException: Didn't find class "org.hamcrest.Matchers" on path: DexPathList[[zip file "/system/framework/android.test.runner.jar", zip file "/system/framework/android.test.mock.jar", zip file "/system/framework/android.test.base.jar", zip file "/data/app/~~UguPPwYCXrZuMQf6D3KYbw==/net.developermaster.kotlincanivetesuico.test-T2neBSI1x_KS_o5vjq3pnw==/base.apk", zip file "/data/app/~~4cirVGi9M1BpYlt-fE3yWA==/net.developermaster.kotlincanivetesuico-U3aR6sXLieW5hw2yO6OiHw==/base.apk"],nativeLibraryDirectories=[/data/app/~~UguPPwYCXrZuMQf6D3KYbw==/net.developermaster.kotlincanivetesuico.test-T2neBSI1x_KS_o5vjq3pnw==/lib/x86_64, /data/app/~~4cirVGi9M1BpYlt-fE3yWA==/net.developermaster.kotlincanivetesuico-U3aR6sXLieW5hw2yO6OiHw==/lib/x86_64, /data/app/~~UguPPwYCXrZuMQf6D3KYbw==/net.developermaster.kotlincanivetesuico.test-T2neBSI1x_KS_o5vjq3pnw==/base.apk!/lib/x86_64, /data/app/~~4cirVGi9M1BpYlt-fE3yWA==/net.developermaster.kotlincanivetesuico-U3aR6sXLieW5hw2yO6OiHw==/base.apk!/lib/x86_64, /system/lib64, /system_ext/lib64]]
at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:259)
at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
... 45 more
 java.lang.ClassNotFoundExceptionãjava.lang.NoClassDefFoundError: Failed resolution of: Lorg/hamcrest/Matchers;
at androidx.test.espresso.matcher.ViewMatchers.withId(ViewMatchers.java:248)
at net.developermaster.kotlincanivetesuico.ui.home.view.FragmentHomeTest$verificar_posicao$1.invokeSuspend(FragmentHomeTest.kt:36)
at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:104)
at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:277)
at kotlinx.coroutines.BlockingCoroutine.joinBlocking(Builders.kt:95)
at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(Builders.kt:69)
at kotlinx.coroutines.BuildersKt.runBlocking(Unknown Source:1)
at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(Builders.kt:48)
at kotlinx.coroutines.BuildersKt.runBlocking$default(Unknown Source:1)
at net.developermaster.kotlincanivetesuico.ui.home.view.FragmentHomeTest.verificar_posicao(FragmentHomeTest.kt:34)
... 33 trimmed
Caused by: java.lang.ClassNotFoundException: Didn't find class "org.hamcrest.Matchers" on path: DexPathList[[zip file "/system/framework/android.test.runner.jar", zip file "/system/framework/android.test.mock.jar", zip file "/system/framework/android.test.base.jar", zip file "/data/app/~~UguPPwYCXrZuMQf6D3KYbw==/net.developermaster.kotlincanivetesuico.test-T2neBSI1x_KS_o5vjq3pnw==/base.apk", zip file "/data/app/~~4cirVGi9M1BpYlt-fE3yWA==/net.developermaster.kotlincanivetesuico-U3aR6sXLieW5hw2yO6OiHw==/base.apk"],nativeLibraryDirectories=[/data/app/~~UguPPwYCXrZuMQf6D3KYbw==/net.developermaster.kotlincanivetesuico.test-T2neBSI1x_KS_o5vjq3pnw==/lib/x86_64, /data/app/~~4cirVGi9M1BpYlt-fE3yWA==/net.developermaster.kotlincanivetesuico-U3aR6sXLieW5hw2yO6OiHw==/lib/x86_64, /data/app/~~UguPPwYCXrZuMQf6D3KYbw==/net.developermaster.kotlincanivetesuico.test-T2neBSI1x_KS_o5vjq3pnw==/base.apk!/lib/x86_64, /data/app/~~4cirVGi9M1BpYlt-fE3yWA==/net.developermaster.kotlincanivetesuico-U3aR6sXLieW5hw2yO6OiHw==/base.apk!/lib/x86_64, /system/lib64, /system_ext/lib64]]
at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:259)
at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
... 45 more
"¯

logcatandroid™
–/home/rael/BACKUPs/ANDROID/APPS_EM_DESENVOLVIMENTO/PUBLICO/Kotlin_Canivete_Suico/KotlinCaniveteSuico/app/build/outputs/androidTest-results/connected/debug/Pixel_5_API_34(AVD) - 14/logcat-net.developermaster.kotlincanivetesuico.ui.home.view.FragmentHomeTest-verificar_posicao.txt"à

device-infoandroidÅ
Â/home/rael/BACKUPs/ANDROID/APPS_EM_DESENVOLVIMENTO/PUBLICO/Kotlin_Canivete_Suico/KotlinCaniveteSuico/app/build/outputs/androidTest-results/connected/debug/Pixel_5_API_34(AVD) - 14/device-info.pb"á

device-info.meminfoandroid¾
»/home/rael/BACKUPs/ANDROID/APPS_EM_DESENVOLVIMENTO/PUBLICO/Kotlin_Canivete_Suico/KotlinCaniveteSuico/app/build/outputs/androidTest-results/connected/debug/Pixel_5_API_34(AVD) - 14/meminfo"á

device-info.cpuinfoandroid¾
»/home/rael/BACKUPs/ANDROID/APPS_EM_DESENVOLVIMENTO/PUBLICO/Kotlin_Canivete_Suico/KotlinCaniveteSuico/app/build/outputs/androidTest-results/connected/debug/Pixel_5_API_34(AVD) - 14/cpuinfo*Å
c
test-results.logOcom.google.testing.platform.runtime.android.driver.AndroidInstrumentationDriverÏ
Ì/home/rael/BACKUPs/ANDROID/APPS_EM_DESENVOLVIMENTO/PUBLICO/Kotlin_Canivete_Suico/KotlinCaniveteSuico/app/build/outputs/androidTest-results/connected/debug/Pixel_5_API_34(AVD) - 14/testlog/test-results.log 2
text/plain