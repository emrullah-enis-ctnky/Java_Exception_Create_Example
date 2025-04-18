# Age Verification Programı (Java)

Bu proje, Java dilinde özel bir exception (istisna) sınıfı kullanarak kullanıcı yaş doğrulaması yapan basit bir konsol uygulamasıdır.

## 📄 Proje Açıklaması

Kullanıcıdan yaş bilgisi alınır ve bu bilgiye göre:

- Yaş **18'den büyükse** kullanıcı "Geçebilirsiniz" mesajı alır.
- Yaş **18 veya daha küçükse**, `InvalidAgeException` adlı özel bir exception fırlatılır ve kullanıcıya hata mesajı gösterilir.

## 🧩 Sınıflar

### `InvalidAgeException.java`

Bu sınıf, Java'nın `Exception` sınıfından türeyen özel bir istisna sınıfıdır. Belirli kurallara uymayan yaş girişleri için kullanılır.

```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String messageString) {
        super(messageString);
    }
}
```

### `Main.java`

Kullanıcıdan yaş girişini alır ve kontrol eder. Şayet yaş 18 veya daha büyükse "Geçebilirsiniz" mesajı basılır. Aksi takdirde özel exception fırlatılır.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int age = scanner.nextInt();
            if (age > 18) {
                System.out.println("Geçebilirsiniz.");
            } else {
                throw new InvalidAgeException("Yaşı 18'den küçükler giremez!");
            }
        } catch (Exception e) {
            System.out.println("Hata: " + e);
        }
    }
}
```

## 🧪 Örnek Kullanım

```bash
> 21
Geçebilirsiniz.

> 16
Hata: InvalidAgeException: Yaşı 18'den küçükler giremez!
```

## 🎯 Hedeflenen Kazanımlar

- Java'da özel istisna (exception) sınıfı tanımlamak
- `try-catch` blokları ile hata yakalama
- Kullanıcıdan veri alma (Scanner kullanımı)

## ⚙️ Gereksinimler

- Java JDK 8 veya üzeri
- Bir Java IDE'si (IntelliJ IDEA, Eclipse vs.) veya terminal ortamı

## 📁 Proje Yapısı

```
src/
├── InvalidAgeException.java
└── Main.java
```

## 👨‍💻 Geliştirici

Bu proje [Emrullah Enis Çetinkaya](https://github.com/emrullah-enis-ctnky) tarafından Java öğrenme sürecinde geliştirilmiştir.

---

Proje katkılarına açıktır. Her türlü öneri ve geliştirme için pull request gönderebilirsiniz!


