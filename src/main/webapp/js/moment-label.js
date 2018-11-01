import moment from "moment";

export class MomentLabel extends HTMLElement {
    constructor() {
        super();

        this.attachShadow({mode: "open"});
        this.timeAgo = document.createElement('span');
        this.shadowRoot.appendChild(this.timeAgo);

    }

    connectedCallback() {
        this.updateTimeAgo();
    }

    updateTimeAgo() {
        this.timeAgo.innerText = moment(this.value).locale(this.locale).calendar();
    }

    static get observedAttributes() {
        return ['value', 'label'];
    }

    attributeChangedCallback(name, oldValue, newValue) {
        this.updateTimeAgo();
    }

    set locale(newValue) {
        this.setAttribute('locale', newValue);
    }

    set value(newValue) {
        this.setAttribute('value', newValue);
    }

    get locale() {
        return this.getAttribute('locale');
    }

    get value() {
        return this.getAttribute('value');
    }


}
