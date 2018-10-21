class IconButton extends HTMLButtonElement {
    constructor() {
        super();
    }
}

customElements.define('icon-button', IconButton, {extends: 'button'});
