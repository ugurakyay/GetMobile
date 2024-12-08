# Getmobil.com Test Otomasyon Projesi

Bu proje, Getmobil.com e-ticaret platformu için uçtan uca (E2E) test senaryolarını kapsayan bir otomasyon altyapısıdır. Selenium WebDriver, TestNG ve Allure raporlama araçları kullanılmıştır.

## Gereksinimler
- **Java 8 veya üzeri**
- **Gradle** (en az 7.0 versiyonu)
- **ChromeDriver** (sisteminizde yüklü olmalı)
- **Git** (versiyon kontrolü için)

## Proje Yapısı
Bu proje **Page Object Model (POM)** tasarım desenine uygun olarak yapılandırılmıştır:
- **`src/main/java/pages/`**: Sayfa objelerini içerir.
- **`src/test/java/tests/`**: Test senaryolarını içerir.
- **`src/test/java/utils/`**: Yardımcı sınıflar ve yapılandırma dosyalarını içerir.

## Kurulum ve Çalıştırma Adımları

### 1. Reponun Klonlanması
```bash
git clone <repo-url>
cd gradle-project
