@file:Suppress("UnstableApiUsage")

package me.example.testplugin.bootstrap

import io.papermc.paper.plugin.bootstrap.BootstrapContext
import io.papermc.paper.plugin.bootstrap.PluginBootstrap
import io.papermc.paper.plugin.bootstrap.PluginProviderContext
import me.example.testplugin.TestPlugin
import org.bukkit.plugin.java.JavaPlugin

class TestPluginBootstrap : PluginBootstrap {

    override fun bootstrap(context: BootstrapContext) {
        // TODO: Bootstrap logic
    }

    override fun createPlugin(context: PluginProviderContext): JavaPlugin {
        return TestPlugin()
    }
}