package org.example;
/*
* Bu örnekte, VehicleFactory aracılığıyla araç nesnesi oluşturuyoruz ve bu nesnenin start metodunu çağırıyoruz.
* CarFactory veya MotorcycleFactory'yi kullanarak, istediğimiz tip aracı elde edebiliriz.
*
* Factory Design Pattern, nesne oluşturmanın (instantiation) ve bu nesnelerin hangi sınıftan türetildiğinin
*  belirlenmesinin soyutlandığı durumlar için kullanılır. Bu desen, özellikle aşağıdaki durum ve gereksinimlerde kullanılabilir:

    Nesne Oluşturma Karmaşıklığı:
        Nesnelerin oluşturulması karmaşık veya altında başka nesnelerin oluşturulmasını gerektiren bir süreç içeriyorsa,
        *  Factory Design Pattern bu karmaşıklığı gizleyerek daha temiz bir kod yapısı sunabilir.

    Nesne Oluşturma Mantığı Değişebilir:
        Nesnelerin oluşturulma mantığı, sürekli değişiyorsa veya farklı durumlara göre değişiklik gösteriyorsa,
        *  Factory Pattern bu değişkenliği yönetmek için uygundur.

    Nesne Tipi Belirlemeleri Run-Time'da Yapılıyorsa:
        Nesnelerin hangi tip veya alt tip olacağı çalışma zamanında belirleniyorsa, Factory Pattern bu
        *  tip belirleme işlemini kolaylaştırabilir.

    Sınıfların Arayüzünü Korumak:
        Kullanıcıların nesne yaratma sürecini bilmemeleri, sadece arayüzle (interface) etkileşimde bulunmaları isteniyorsa,
        *  Factory Pattern bu soyutlamayı sağlar.

    Sınıf Hiyerarşileri ve Alt Sınıfların Seçimi:
        Belirli bir sınıf hiyerarşisindeki alt sınıfların seçimi, Factory Pattern ile merkezi bir noktada yönetilebilir.
        *  Kullanıcı, doğrudan alt sınıflarla ilgilenmez.

    Tek Sorumluluk Prensibi:
        Bir sınıfın birden fazla sorumluluğu olmamalıdır. Bu durumda, nesne yaratma işlevselliği başka bir sınıfa
        *  taşınarak tek sorumluluk prensibi korunabilir.

Örnek olarak, bir GUI (Graphical User Interface) kütüphanesini düşünelim.
*  Bu kütüphane, butonlar, metin kutuları ve diğer GUI öğelerini oluşturur.
*  Ancak her bir öğenin oluşturulma süreci farklı olabilir ve kullanıcıların bu süreci bilmesi istenmez.
*  Factory Design Pattern, bu durumu ele alarak nesnelerin oluşturulması sürecini soyutlar ve kullanıcıya sadece
*  arayüzle etkileşimde bulunma olanağı sağlar.
* */
public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.start();
    }
}