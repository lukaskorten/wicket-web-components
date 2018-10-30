export class MomentLabel extends HTMLElement {
    constructor() {
        super();
        this.render();
    }

    render() {
        const shadow = this.attachShadow({mode: "open"});
        const dateString = this.innerText;

        const label = document.createElement('span');
        label.innerText = dateString;
        shadow.appendChild(label);
    }
}
