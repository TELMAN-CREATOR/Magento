Feature: Adres ekleme

  Scenario: Kullanıcı hesabına adres ekler
    Given Kullanıcı magento sitesine giriş yapar
    When My Account sayfasına gider
    And Manage Address bağlantısına tıklar
    And Yeni adres ekler: "<ad>", "<soyad>", "<adres>", "<şehir>", "<postaKodu>", "<ülke>", "<telefon>"
    Then Adres başarıyla eklenmiş olmalıdır

