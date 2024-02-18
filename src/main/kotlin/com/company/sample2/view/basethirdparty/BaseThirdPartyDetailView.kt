package com.company.sample2.view.basethirdparty

import com.company.sample2.entity.BaseThirdParty
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "baseThirdParties/:id", layout = MainView::class)
@ViewController("BaseThirdParty.detail")
@ViewDescriptor("base-third-party-detail-view.xml")
@EditedEntityContainer("baseThirdPartyDc")
class BaseThirdPartyDetailView : StandardDetailView<BaseThirdParty>() {
}
