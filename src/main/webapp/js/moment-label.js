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
        this._intervalId = setInterval(this.updateTimeAgo.bind(this), 60000);
    }

    disconnectedCallback() {
        clearInterval(this._intervalId);
    }

    updateTimeAgo() {
        const givenMoment = moment(this.value);
        const currentMoment = moment();

        if (givenMoment.isSame(currentMoment, 'day')) {
            this.timeAgo.innerText = givenMoment.locale(this.locale).fromNow();
        } else {
            this.timeAgo.innerText = givenMoment.locale(this.locale).calendar();
        }
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
