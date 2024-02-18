package com.company.sample2.view.legalperson

import com.company.sample2.entity.LegalPerson
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "legalPersons/:id", layout = MainView::class)
@ViewController("LegalPerson.detail")
@ViewDescriptor("legal-person-detail-view.xml")
@EditedEntityContainer("legalPersonDc")
class LegalPersonDetailView : StandardDetailView<LegalPerson>() {
}
