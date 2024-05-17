package me.youngmi.restapiwithspring.events;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

// BeanSerializer 직렬화 해 변환 하면 멤버 이름을 응답 값 키로 보냄
// 직렬화시 래핑을 꺼내줌 => @JsonUnwrapped
public class EventResource extends EntityModel<Event> {

    public EventResource(Event event, Iterable<Link> links) {
        super(event, links);
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }

    public EventResource(Event event) {
        super(event);
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
