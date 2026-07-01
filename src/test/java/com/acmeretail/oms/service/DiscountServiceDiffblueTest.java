package com.acmeretail.oms.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.acmeretail.oms.domain.enums.LoyaltyTier;
import com.acmeretail.oms.domain.vo.Money;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DiscountService.class})
@ExtendWith(SpringExtension.class)
class DiscountServiceDiffblueTest {
  @Autowired private DiscountService discountService;

  /**
   * Test {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Money} {@link Money#multiply(int)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}
   */
  @Test
  @DisplayName(
      "Test buyXGetYDiscount(int, int, int, Money); given 'null'; when Money multiply(int) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.buyXGetYDiscount(int, int, int, Money)"})
  void testBuyXGetYDiscount_givenNull_whenMoneyMultiplyReturnNull_thenReturnNull() {
    // Arrange
    Money unitPrice = mock(Money.class);
    when(unitPrice.multiply(anyInt())).thenReturn(null);

    // Act
    Money actualBuyXGetYDiscountResult = discountService.buyXGetYDiscount(3, 1, 1, unitPrice);

    // Assert
    verify(unitPrice).multiply(1);
    assertNull(actualBuyXGetYDiscountResult);
  }

  /**
   * Test {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Money} {@link Money#multiply(int)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}
   */
  @Test
  @DisplayName(
      "Test buyXGetYDiscount(int, int, int, Money); given 'null'; when Money multiply(int) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.buyXGetYDiscount(int, int, int, Money)"})
  void testBuyXGetYDiscount_givenNull_whenMoneyMultiplyReturnNull_thenReturnNull2() {
    // Arrange
    Money unitPrice = mock(Money.class);
    when(unitPrice.multiply(anyInt())).thenReturn(null);

    // Act
    Money actualBuyXGetYDiscountResult = discountService.buyXGetYDiscount(3, 1, 3, unitPrice);

    // Assert
    verify(unitPrice).multiply(2);
    assertNull(actualBuyXGetYDiscountResult);
  }

  /**
   * Test {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}.
   *
   * <ul>
   *   <li>Then calls {@link Money#getCurrency()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}
   */
  @Test
  @DisplayName("Test buyXGetYDiscount(int, int, int, Money); then calls getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.buyXGetYDiscount(int, int, int, Money)"})
  void testBuyXGetYDiscount_thenCallsGetCurrency() {
    // Arrange
    Money unitPrice = mock(Money.class);
    when(unitPrice.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> discountService.buyXGetYDiscount(0, 0, 0, unitPrice));
    verify(unitPrice).getCurrency();
  }

  /**
   * Test {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}.
   *
   * <ul>
   *   <li>Then calls {@link Money#getCurrency()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}
   */
  @Test
  @DisplayName("Test buyXGetYDiscount(int, int, int, Money); then calls getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.buyXGetYDiscount(int, int, int, Money)"})
  void testBuyXGetYDiscount_thenCallsGetCurrency2() {
    // Arrange
    Money unitPrice = mock(Money.class);
    when(unitPrice.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> discountService.buyXGetYDiscount(0, 3, 0, unitPrice));
    verify(unitPrice).getCurrency();
  }

  /**
   * Test {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#multiply(int)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}
   */
  @Test
  @DisplayName(
      "Test buyXGetYDiscount(int, int, int, Money); when Money multiply(int) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.buyXGetYDiscount(int, int, int, Money)"})
  void testBuyXGetYDiscount_whenMoneyMultiplyThrowIllegalArgumentException() {
    // Arrange
    Money unitPrice = mock(Money.class);
    when(unitPrice.multiply(anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> discountService.buyXGetYDiscount(3, 1, 1, unitPrice));
    verify(unitPrice).multiply(1);
  }

  /**
   * Test {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#buyXGetYDiscount(int, int, int, Money)}
   */
  @Test
  @DisplayName(
      "Test buyXGetYDiscount(int, int, int, Money); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.buyXGetYDiscount(int, int, int, Money)"})
  void testBuyXGetYDiscount_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> discountService.buyXGetYDiscount(3, 3, 3, null));
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Money} {@link Money#isPositive()} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); given 'false'; when Money isPositive() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_givenFalse_whenMoneyIsPositiveReturnFalse() {
    // Arrange
    Money discountableSubtotal = mock(Money.class);
    when(discountableSubtotal.isPositive()).thenReturn(false);
    when(discountableSubtotal.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.loyaltyDiscount(LoyaltyTier.BRONZE, discountableSubtotal));
    verify(discountableSubtotal).getCurrency();
    verify(discountableSubtotal).isPositive();
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>When {@link LoyaltyTier#NONE}.
   *   <li>Then calls {@link Money#getCurrency()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); given IllegalArgumentException(); when NONE; then calls getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_givenIllegalArgumentException_whenNone_thenCallsGetCurrency() {
    // Arrange
    Money discountableSubtotal = mock(Money.class);
    when(discountableSubtotal.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.loyaltyDiscount(LoyaltyTier.NONE, discountableSubtotal));
    verify(discountableSubtotal).getCurrency();
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>When {@code null}.
   *   <li>Then calls {@link Money#getCurrency()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); given IllegalArgumentException(); when 'null'; then calls getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_givenIllegalArgumentException_whenNull_thenCallsGetCurrency() {
    // Arrange
    Money discountableSubtotal = mock(Money.class);
    when(discountableSubtotal.getCurrency()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.loyaltyDiscount(null, discountableSubtotal));
    verify(discountableSubtotal).getCurrency();
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link Money} {@link Money#percentage(double)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); given 'null'; when Money percentage(double) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_givenNull_whenMoneyPercentageReturnNull_thenReturnNull() {
    // Arrange
    Money discountableSubtotal = mock(Money.class);
    when(discountableSubtotal.percentage(anyDouble())).thenReturn(null);
    when(discountableSubtotal.isPositive()).thenReturn(true);

    // Act
    Money actualLoyaltyDiscountResult =
        discountService.loyaltyDiscount(LoyaltyTier.BRONZE, discountableSubtotal);

    // Assert
    verify(discountableSubtotal).isPositive();
    verify(discountableSubtotal).percentage(2.0d);
    assertNull(actualLoyaltyDiscountResult);
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#isPositive()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); when Money isPositive() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_whenMoneyIsPositiveThrowIllegalArgumentException() {
    // Arrange
    Money discountableSubtotal = mock(Money.class);
    when(discountableSubtotal.isPositive()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.loyaltyDiscount(LoyaltyTier.BRONZE, discountableSubtotal));
    verify(discountableSubtotal).isPositive();
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#percentage(double)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); when Money percentage(double) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_whenMoneyPercentageThrowIllegalArgumentException() {
    // Arrange
    Money discountableSubtotal = mock(Money.class);
    when(discountableSubtotal.percentage(anyDouble())).thenThrow(new IllegalArgumentException());
    when(discountableSubtotal.isPositive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.loyaltyDiscount(LoyaltyTier.BRONZE, discountableSubtotal));
    verify(discountableSubtotal).isPositive();
    verify(discountableSubtotal).percentage(2.0d);
  }

  /**
   * Test {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}.
   *
   * <ul>
   *   <li>When {@code NONE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#loyaltyDiscount(LoyaltyTier, Money)}
   */
  @Test
  @DisplayName(
      "Test loyaltyDiscount(LoyaltyTier, Money); when 'NONE'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.loyaltyDiscount(LoyaltyTier, Money)"})
  void testLoyaltyDiscount_whenNone_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.loyaltyDiscount(LoyaltyTier.NONE, null));
  }

  /**
   * Test {@link DiscountService#capToMaximum(Money, Money)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Money} {@link Money#isGreaterThan(Money)} return {@code false}.
   *   <li>Then return {@link Money}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#capToMaximum(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test capToMaximum(Money, Money); given 'false'; when Money isGreaterThan(Money) return 'false'; then return Money")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.capToMaximum(Money, Money)"})
  void testCapToMaximum_givenFalse_whenMoneyIsGreaterThanReturnFalse_thenReturnMoney() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any())).thenReturn(false);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(null);

    // Act
    Money actualCapToMaximumResult = discountService.capToMaximum(proposedDiscount, subtotal);

    // Assert
    verify(proposedDiscount).isGreaterThan(isNull());
    verify(subtotal).percentage(45.0d);
    assertSame(proposedDiscount, actualCapToMaximumResult);
  }

  /**
   * Test {@link DiscountService#capToMaximum(Money, Money)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Money} {@link Money#isGreaterThan(Money)} return {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#capToMaximum(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test capToMaximum(Money, Money); given 'true'; when Money isGreaterThan(Money) return 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.capToMaximum(Money, Money)"})
  void testCapToMaximum_givenTrue_whenMoneyIsGreaterThanReturnTrue_thenReturnNull() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any())).thenReturn(true);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(null);

    // Act
    Money actualCapToMaximumResult = discountService.capToMaximum(proposedDiscount, subtotal);

    // Assert
    verify(proposedDiscount).isGreaterThan(isNull());
    verify(subtotal).percentage(45.0d);
    assertNull(actualCapToMaximumResult);
  }

  /**
   * Test {@link DiscountService#capToMaximum(Money, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#isGreaterThan(Money)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#capToMaximum(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test capToMaximum(Money, Money); when Money isGreaterThan(Money) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.capToMaximum(Money, Money)"})
  void testCapToMaximum_whenMoneyIsGreaterThanThrowIllegalArgumentException() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any()))
        .thenThrow(new IllegalArgumentException());

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(null);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.capToMaximum(proposedDiscount, subtotal));
    verify(proposedDiscount).isGreaterThan(isNull());
    verify(subtotal).percentage(45.0d);
  }

  /**
   * Test {@link DiscountService#capToMaximum(Money, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#percentage(double)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#capToMaximum(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test capToMaximum(Money, Money); when Money percentage(double) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.capToMaximum(Money, Money)"})
  void testCapToMaximum_whenMoneyPercentageThrowIllegalArgumentException() {
    // Arrange
    Money proposedDiscount = mock(Money.class);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.capToMaximum(proposedDiscount, subtotal));
    verify(subtotal).percentage(45.0d);
  }

  /**
   * Test {@link DiscountService#capToMaximum(Money, Money)}.
   *
   * <ul>
   *   <li>When {@link Money}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#capToMaximum(Money, Money)}
   */
  @Test
  @DisplayName("Test capToMaximum(Money, Money); when Money; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.capToMaximum(Money, Money)"})
  void testCapToMaximum_whenMoney_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.capToMaximum(mock(Money.class), null));
  }

  /**
   * Test {@link DiscountService#capToMaximum(Money, Money)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#capToMaximum(Money, Money)}
   */
  @Test
  @DisplayName("Test capToMaximum(Money, Money); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money DiscountService.capToMaximum(Money, Money)"})
  void testCapToMaximum_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> discountService.capToMaximum(null, null));
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Money} {@link Money#isGreaterThan(Money)} return {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test wouldBeCapped(Money, Money); given 'false'; when Money isGreaterThan(Money) return 'false'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_givenFalse_whenMoneyIsGreaterThanReturnFalse_thenReturnTrue() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any())).thenReturn(false);
    when(proposedDiscount.isLessThan(Mockito.<Money>any())).thenReturn(true);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(null);

    // Act
    boolean actualWouldBeCappedResult = discountService.wouldBeCapped(proposedDiscount, subtotal);

    // Assert
    verify(proposedDiscount).isGreaterThan(isNull());
    verify(proposedDiscount).isLessThan(isA(Money.class));
    verify(subtotal).percentage(45.0d);
    assertTrue(actualWouldBeCappedResult);
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>Given {@link Money} {@link Money#isLessThan(Money)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test wouldBeCapped(Money, Money); given Money isLessThan(Money) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_givenMoneyIsLessThanReturnFalse_thenReturnFalse() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any())).thenReturn(true);

    Money money = mock(Money.class);
    when(money.isLessThan(Mockito.<Money>any())).thenReturn(false);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(money);

    // Act
    boolean actualWouldBeCappedResult = discountService.wouldBeCapped(proposedDiscount, subtotal);

    // Assert
    verify(proposedDiscount).isGreaterThan(isA(Money.class));
    verify(money).isLessThan(isA(Money.class));
    verify(subtotal).percentage(45.0d);
    assertFalse(actualWouldBeCappedResult);
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>Given {@link Money} {@link Money#isLessThan(Money)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test wouldBeCapped(Money, Money); given Money isLessThan(Money) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_givenMoneyIsLessThanReturnTrue_thenReturnTrue() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any())).thenReturn(true);

    Money money = mock(Money.class);
    when(money.isLessThan(Mockito.<Money>any())).thenReturn(true);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(money);

    // Act
    boolean actualWouldBeCappedResult = discountService.wouldBeCapped(proposedDiscount, subtotal);

    // Assert
    verify(proposedDiscount).isGreaterThan(isA(Money.class));
    verify(money).isLessThan(isA(Money.class));
    verify(subtotal).percentage(45.0d);
    assertTrue(actualWouldBeCappedResult);
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#isGreaterThan(Money)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test wouldBeCapped(Money, Money); when Money isGreaterThan(Money) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_whenMoneyIsGreaterThanThrowIllegalArgumentException() {
    // Arrange
    Money proposedDiscount = mock(Money.class);
    when(proposedDiscount.isGreaterThan(Mockito.<Money>any()))
        .thenThrow(new IllegalArgumentException());

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenReturn(null);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.wouldBeCapped(proposedDiscount, subtotal));
    verify(proposedDiscount).isGreaterThan(isNull());
    verify(subtotal).percentage(45.0d);
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>When {@link Money} {@link Money#percentage(double)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName(
      "Test wouldBeCapped(Money, Money); when Money percentage(double) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_whenMoneyPercentageThrowIllegalArgumentException() {
    // Arrange
    Money proposedDiscount = mock(Money.class);

    Money subtotal = mock(Money.class);
    when(subtotal.percentage(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.wouldBeCapped(proposedDiscount, subtotal));
    verify(subtotal).percentage(45.0d);
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>When {@link Money}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName("Test wouldBeCapped(Money, Money); when Money; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_whenMoney_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> discountService.wouldBeCapped(mock(Money.class), null));
  }

  /**
   * Test {@link DiscountService#wouldBeCapped(Money, Money)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountService#wouldBeCapped(Money, Money)}
   */
  @Test
  @DisplayName("Test wouldBeCapped(Money, Money); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DiscountService.wouldBeCapped(Money, Money)"})
  void testWouldBeCapped_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> discountService.wouldBeCapped(null, null));
  }
}
