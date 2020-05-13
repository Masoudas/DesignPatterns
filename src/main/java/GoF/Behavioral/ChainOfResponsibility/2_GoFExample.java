package GoF.Behavioral.ChainOfResponsibility;


class Topic{}

class HelpHandler {
    HelpHandler h;
    Topic t;

    // Default constructor, for defining no handler and no topic
    HelpHandler(){
        this._h
        this._t
    }
    HelpHandler(HelpHandler h, Topic t){}
    ;
    virtual bool HasHelp();
    virtual void SetHandler(HelpHandler*, Topic);
    virtual void HandleHelp();
    private:
    HelpHandler* _successor;
    Topic _topic;
    };