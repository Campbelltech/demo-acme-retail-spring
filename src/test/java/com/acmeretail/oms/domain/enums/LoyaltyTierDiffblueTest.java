package com.acmeretail.oms.domain.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoyaltyTierDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoyaltyTier#getAutomaticDiscountRate()}
   *   <li>{@link LoyaltyTier#getMarketingLabel()}
   *   <li>{@link LoyaltyTier#getRank()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LoyaltyTier.getAutomaticDiscountRate()",
    "String LoyaltyTier.getMarketingLabel()",
    "int LoyaltyTier.getRank()"
  })
  void testGettersAndSetters() {
    // Arrange
    LoyaltyTier valueOfResult = LoyaltyTier.valueOf("NONE");

    // Act
    double actualAutomaticDiscountRate = valueOfResult.getAutomaticDiscountRate();
    String actualMarketingLabel = valueOfResult.getMarketingLabel();

    // Assert
    assertNull(actualMarketingLabel);
    assertEquals(0, valueOfResult.getRank());
    assertEquals(0.0d, actualAutomaticDiscountRate);
  }

  /**
   * Test {@link LoyaltyTier#isAtLeast(LoyaltyTier)}.
   *
   * <ul>
   *   <li>When {@code BRONZE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#isAtLeast(LoyaltyTier)}
   */
  @Test
  @DisplayName("Test isAtLeast(LoyaltyTier); when 'BRONZE'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoyaltyTier.isAtLeast(LoyaltyTier)"})
  void testIsAtLeast_whenBronze_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(LoyaltyTier.NONE.isAtLeast(LoyaltyTier.BRONZE));
  }

  /**
   * Test {@link LoyaltyTier#isAtLeast(LoyaltyTier)}.
   *
   * <ul>
   *   <li>When {@code NONE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#isAtLeast(LoyaltyTier)}
   */
  @Test
  @DisplayName("Test isAtLeast(LoyaltyTier); when 'NONE'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoyaltyTier.isAtLeast(LoyaltyTier)"})
  void testIsAtLeast_whenNone_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(LoyaltyTier.NONE.isAtLeast(LoyaltyTier.NONE));
  }

  /**
   * Test {@link LoyaltyTier#isAtLeast(LoyaltyTier)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#isAtLeast(LoyaltyTier)}
   */
  @Test
  @DisplayName("Test isAtLeast(LoyaltyTier); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoyaltyTier.isAtLeast(LoyaltyTier)"})
  void testIsAtLeast_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(LoyaltyTier.NONE.isAtLeast(null));
  }

  /**
   * Test {@link LoyaltyTier#forLifetimeSpend(long)}.
   *
   * <ul>
   *   <li>When {@code 2499}.
   *   <li>Then return {@code BRONZE}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#forLifetimeSpend(long)}
   */
  @Test
  @DisplayName("Test forLifetimeSpend(long); when '2499'; then return 'BRONZE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoyaltyTier LoyaltyTier.forLifetimeSpend(long)"})
  void testForLifetimeSpend_when2499_thenReturnBronze() {
    // Arrange, Act and Assert
    assertEquals(LoyaltyTier.BRONZE, LoyaltyTier.forLifetimeSpend(2499L));
  }

  /**
   * Test {@link LoyaltyTier#forLifetimeSpend(long)}.
   *
   * <ul>
   *   <li>When {@code 9999}.
   *   <li>Then return {@code SILVER}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#forLifetimeSpend(long)}
   */
  @Test
  @DisplayName("Test forLifetimeSpend(long); when '9999'; then return 'SILVER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoyaltyTier LoyaltyTier.forLifetimeSpend(long)"})
  void testForLifetimeSpend_when9999_thenReturnSilver() {
    // Arrange, Act and Assert
    assertEquals(LoyaltyTier.SILVER, LoyaltyTier.forLifetimeSpend(9999L));
  }

  /**
   * Test {@link LoyaltyTier#forLifetimeSpend(long)}.
   *
   * <ul>
   *   <li>When {@code 24999}.
   *   <li>Then return {@code GOLD}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#forLifetimeSpend(long)}
   */
  @Test
  @DisplayName("Test forLifetimeSpend(long); when '24999'; then return 'GOLD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoyaltyTier LoyaltyTier.forLifetimeSpend(long)"})
  void testForLifetimeSpend_when24999_thenReturnGold() {
    // Arrange, Act and Assert
    assertEquals(LoyaltyTier.GOLD, LoyaltyTier.forLifetimeSpend(24999L));
  }

  /**
   * Test {@link LoyaltyTier#forLifetimeSpend(long)}.
   *
   * <ul>
   *   <li>When {@code 25000}.
   *   <li>Then return {@code PLATINUM}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#forLifetimeSpend(long)}
   */
  @Test
  @DisplayName("Test forLifetimeSpend(long); when '25000'; then return 'PLATINUM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoyaltyTier LoyaltyTier.forLifetimeSpend(long)"})
  void testForLifetimeSpend_when25000_thenReturnPlatinum() {
    // Arrange, Act and Assert
    assertEquals(LoyaltyTier.PLATINUM, LoyaltyTier.forLifetimeSpend(25000L));
  }

  /**
   * Test {@link LoyaltyTier#forLifetimeSpend(long)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code NONE}.
   * </ul>
   *
   * <p>Method under test: {@link LoyaltyTier#forLifetimeSpend(long)}
   */
  @Test
  @DisplayName("Test forLifetimeSpend(long); when ten; then return 'NONE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoyaltyTier LoyaltyTier.forLifetimeSpend(long)"})
  void testForLifetimeSpend_whenTen_thenReturnNone() {
    // Arrange, Act and Assert
    assertEquals(LoyaltyTier.NONE, LoyaltyTier.forLifetimeSpend(10L));
  }
}
