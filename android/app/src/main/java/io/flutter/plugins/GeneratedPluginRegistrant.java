package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.dormmom.flutter_stripe_payment.FlutterStripePaymentPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterStripePaymentPlugin.registerWith(registry.registrarFor("com.dormmom.flutter_stripe_payment.FlutterStripePaymentPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}