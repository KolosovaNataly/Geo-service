package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplMockitoTest {
    @Test
    @DisplayName("Проверка работу метода public Location byIp")
    void byIpShouldReturnCorrectLocation() {
        Location expectedLocation = new Location("", Country.RUSSIA, "", 0);
        GeoServiceImpl geoService = new GeoServiceImpl();
        Country expectedCountry = expectedLocation.getCountry();
        Country resultCountry = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(expectedCountry, resultCountry);
    }
}