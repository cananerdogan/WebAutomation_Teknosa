@headset

Feature: Kulaklık arama senaryosu

  Scenario Outline: Kulaklık arama
    Given Bildirim kabul edilir
    When Arama ikonuna basilir
    Then Arama kutusuna <urun> yazilir
    Then Bluetooth Kulaklika tiklanir
    Then Favori Kategorisine tiklanir
    Then Ilk Urun Secilir ve Sepete Eklenir
    Then Alisverise Devam Edilir
    Then Son Urun Secilir ve Sepete Eklenir
    Then Sepete Gidilir
#    Then Ucuz urunun sayisi arttirilir
    Then Alisveris Bitirilir
    Then Uye Olmadan Devam Edilir
    And Eposta Adresi <email> Girilir


    Examples:
      | urun       | email                     |
      | "Kulaklık" | "cananbektas@icterra.com" |
