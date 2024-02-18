package com.company.sample2.view.naturalperson

import com.company.sample2.entity.NaturalPerson
import com.company.sample2.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "naturalPersons/:id", layout = MainView::class)
@ViewController("NaturalPerson.detail")
@ViewDescriptor("natural-person-detail-view.xml")
@EditedEntityContainer("naturalPersonDc")
class NaturalPersonDetailView : StandardDetailView<NaturalPerson>() {
}
