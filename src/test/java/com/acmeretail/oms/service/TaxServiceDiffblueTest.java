package com.acmeretail.oms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.acmeretail.oms.domain.enums.TaxClass;
import com.acmeretail.oms.domain.vo.Money;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.math.BigDecimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {TaxService.class})
@ExtendWith(SpringExtension.class)
class TaxServiceDiffblueTest {
  @Autowired private TaxService taxService;

  /**
   * Test {@link TaxService#standardRateFor(String, String)}.
   *
   * <ul>
   *   <li>When {@code GB}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.2000}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#standardRateFor(String, String)}
   */
  @Test
  @DisplayName(
      "Test standardRateFor(String, String); when 'GB'; then return BigDecimal(String) with '0.2000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal TaxService.standardRateFor(String, String)"})
  void testStandardRateFor_whenGb_thenReturnBigDecimalWith02000() {
    // Arrange and Act
    BigDecimal actualStandardRateForResult = taxService.standardRateFor("GB", " ");

    // Assert
    assertEquals(new BigDecimal("0.2000"), actualStandardRateForResult);
  }

  /**
   * Test {@link TaxService#standardRateFor(String, String)}.
   *
   * <ul>
   *   <li>When {@code GBR}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.0700}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#standardRateFor(String, String)}
   */
  @Test
  @DisplayName(
      "Test standardRateFor(String, String); when 'GBR'; then return BigDecimal(String) with '0.0700'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal TaxService.standardRateFor(String, String)"})
  void testStandardRateFor_whenGbr_thenReturnBigDecimalWith00700() {
    // Arrange and Act
    BigDecimal actualStandardRateForResult = taxService.standardRateFor("GBR", "us-east-2");

    // Assert
    assertEquals(new BigDecimal("0.0700"), actualStandardRateForResult);
  }

  /**
   * Test {@link TaxService#standardRateFor(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.0700}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#standardRateFor(String, String)}
   */
  @Test
  @DisplayName(
      "Test standardRateFor(String, String); when 'null'; then return BigDecimal(String) with '0.0700'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal TaxService.standardRateFor(String, String)"})
  void testStandardRateFor_whenNull_thenReturnBigDecimalWith00700() {
    // Arrange and Act
    BigDecimal actualStandardRateForResult = taxService.standardRateFor(null, " ");

    // Assert
    assertEquals(new BigDecimal("0.0700"), actualStandardRateForResult);
  }

  /**
   * Test {@link TaxService#standardRateFor(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.2000}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#standardRateFor(String, String)}
   */
  @Test
  @DisplayName(
      "Test standardRateFor(String, String); when 'null'; then return BigDecimal(String) with '0.2000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal TaxService.standardRateFor(String, String)"})
  void testStandardRateFor_whenNull_thenReturnBigDecimalWith02000() {
    // Arrange and Act
    BigDecimal actualStandardRateForResult = taxService.standardRateFor("GB", null);

    // Assert
    assertEquals(new BigDecimal("0.2000"), actualStandardRateForResult);
  }

  /**
   * Test {@link TaxService#standardRateFor(String, String)}.
   *
   * <ul>
   *   <li>When space.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.0700}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#standardRateFor(String, String)}
   */
  @Test
  @DisplayName(
      "Test standardRateFor(String, String); when space; then return BigDecimal(String) with '0.0700'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal TaxService.standardRateFor(String, String)"})
  void testStandardRateFor_whenSpace_thenReturnBigDecimalWith00700() {
    // Arrange and Act
    BigDecimal actualStandardRateForResult = taxService.standardRateFor(" ", " ");

    // Assert
    assertEquals(new BigDecimal("0.0700"), actualStandardRateForResult);
  }

  /**
   * Test {@link TaxService#standardRateFor(String, String)}.
   *
   * <ul>
   *   <li>When {@code us-east-2}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.2000}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#standardRateFor(String, String)}
   */
  @Test
  @DisplayName(
      "Test standardRateFor(String, String); when 'us-east-2'; then return BigDecimal(String) with '0.2000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal TaxService.standardRateFor(String, String)"})
  void testStandardRateFor_whenUsEast2_thenReturnBigDecimalWith02000() {
    // Arrange and Act
    BigDecimal actualStandardRateForResult = taxService.standardRateFor("GB", "us-east-2");

    // Assert
    assertEquals(new BigDecimal("0.2000"), actualStandardRateForResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code GB}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given 'null'; when 'GB'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenNull_whenGb_thenReturnNull() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.REDUCED, "GB", " ", false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code GBR}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given 'null'; when 'GBR'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenNull_whenGbr_thenReturnNull() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.REDUCED, "GBR", " ", false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Money} {@link Money#multiply(BigDecimal)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given 'null'; when Money multiply(BigDecimal) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenNull_whenMoneyMultiplyReturnNull_thenReturnNull() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.REDUCED, " ", " ", false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given 'null'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenNull_whenNull_thenReturnNull() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.REDUCED, null, " ", false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given 'null'; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenNull_whenNull_thenReturnNull2() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.REDUCED, "GB", null, false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code us-east-2}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given 'null'; when 'us-east-2'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenNull_whenUsEast2_thenReturnNull() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.REDUCED, "GB", "us-east-2", false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link TaxService} (default constructor).
   *   <li>When {@link TaxClass#STANDARD}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given TaxService (default constructor); when STANDARD; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenTaxService_whenStandard_thenReturnNull() {
    // Arrange
    TaxService taxService = new TaxService();

    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any())).thenReturn(null);
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act
    Money actualCalculateTaxResult =
        taxService.calculateTax(taxableAmount, TaxClass.STANDARD, " ", " ", false);

    // Assert
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
    assertNull(actualCalculateTaxResult);
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link TaxService}.
   *   <li>When {@code STANDARD}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given TaxService; when 'STANDARD'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenTaxService_whenStandard_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> taxService.calculateTax(null, TaxClass.STANDARD, "GB", "us-east-2", true));
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link TaxService} (default constructor).
   *   <li>When {@code ZERO_RATED}.
   *   <li>Then calls {@link Money#getCurrency()}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); given TaxService (default constructor); when 'ZERO_RATED'; then calls getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_givenTaxService_whenZeroRated_thenCallsGetCurrency() {
    // Arrange
    TaxService taxService = new TaxService();

    Money taxableAmount = mock(Money.class);
    when(taxableAmount.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> taxService.calculateTax(taxableAmount, TaxClass.ZERO_RATED, " ", " ", false));
    verify(taxableAmount).getCurrency();
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>Then calls {@link Money#getCurrency()}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); then calls getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_thenCallsGetCurrency() {
    // Arrange
    TaxService taxService = new TaxService();

    Money taxableAmount = mock(Money.class);
    when(taxableAmount.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> taxService.calculateTax(taxableAmount, TaxClass.STANDARD, " ", " ", true));
    verify(taxableAmount).getCurrency();
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#isPositive()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); when Money isPositive() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_whenMoneyIsPositiveThrowIllegalArgumentException() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.isPositive()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> taxService.calculateTax(taxableAmount, TaxClass.REDUCED, " ", " ", false));
    verify(taxableAmount).isPositive();
  }

  /**
   * Test {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#multiply(BigDecimal)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link TaxService#calculateTax(Money, TaxClass, String, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test calculateTax(Money, TaxClass, String, String, boolean); when Money multiply(BigDecimal) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money TaxService.calculateTax(Money, TaxClass, String, String, boolean)"})
  void testCalculateTax_whenMoneyMultiplyThrowIllegalArgumentException() {
    // Arrange
    Money taxableAmount = mock(Money.class);
    when(taxableAmount.multiply(Mockito.<BigDecimal>any()))
        .thenThrow(new IllegalArgumentException());
    when(taxableAmount.isPositive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> taxService.calculateTax(taxableAmount, TaxClass.REDUCED, " ", " ", false));
    verify(taxableAmount).isPositive();
    verify(taxableAmount).multiply(isA(BigDecimal.class));
  }
}
