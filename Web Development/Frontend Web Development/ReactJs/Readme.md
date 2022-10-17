# ReactJs Roadmap

----------------

## Requirements

- Basic knowledge of HTML, CSS
- Basic knowledge of Javascript, ES6 and above
  - Arrow functions
  - Destructuring
  - Spread operator
  - .map(), .filter(), .reduce(), .forEach() etc
  - Browser Events
- Fundamentals 
  - Create React App
  - JSX
  - Components
    - Functional Components
    - Class Components
  - Props vs State
  - Conditional Rendering
  - Component Life Cycle
  - Lists and Keys
  - Composition vs Inheritance
  - Basic Hooks
    - `useState` and `useEffect`
- Advanced Topics
  - More Advance Hooks
    - useMemo
    - useReducer
    - useContext
    - useCallback
    - useRef
  - Custom Hooks
  - Context
  - Refs
  - Render Props
  - Routing 
  - SSR, SSG
  - Redux

**You can learn these from [Javascript Roadmap](/Javascript/Readme.md)**

----------------

## Roadmap

```mermaid
flowchart LR
    A(((ReactJs))) --> B((Basics))
    B --> BA(Create React App)
    B ---> BB(JSX)
    B ----> BC(Components)
    B ---> BD(Props)
    B ----> BE(Component Lifecycle)
    B ---> BF(State Management)
    B ----> BG(Conditional Rendering)
    B ---> BH(Handling Events)
    B ---> BI(Basic Hooks)
    BI --> BIA(useState)
    BI ---> BIB(useEffect)

    A ---> C((Advanced Topics))
    C ---> CA(Higher Order Components)
    C ---> CB(Render Props)
    C ---> CC(Portals)
    C ---> CG(Hooks)
    C ---> CD(Refs)
    C ---> CE(Context API)
    C --> CF(Fragments)
    CG --> CGA(Custom Hooks)
    CG --> CGB(Common Hooks)
    CGB --> CGBA(useReducer)
    CGB ---> CGBB(useCallback)
    CGB --> CGBD(useMemo)
    CGB ---> CGBE(useRef)
    CGB --> CGBF(useContext)


    A ---> D((Ecosystem))
    D --> DA(Routes)
    DA --> DAA(React Router)
    DB --> DBA(Redux)
    DB --> DBB(React Context / State)
    DB --> DBC(Recoil)
    DC --> DCA(Inline CSS)
    DC ---> DCB(Styled Components)
    DC --> DCC(CSS/SCSS Modules)
    DC ---> DCD(Ant Design)
    DC --> DCE(Material UI)
    DC ---> DCF(Chakra UI)
    DC --> DCG(Tailwind CSS)
    DC --> DCH(Styled System)
    D ---> DD(API Calls)
    DD --> DDA(Axios)
    D ---> DE(SSR)
    DD --> DDB(React Query)
    DD --> DDC(Fetch API)
    DD ---> DDD(REST API)
    D --> DC(Styling)
    D ---> DB(State Management)
    DE --> DEA(Next.js)
    D ---> DF(SSG)
    DF --> DFA(Gatsby.js)
    D ---> DG(Forms)
    DG --> DGA(Formik)
    DG --> DGB(React Hook Form)
    D ---> DH(Testing)
    DH --> DHA(Jest)
    DH ---> DHB(React Testing Library)
    DH --> DHC(Cypress)
    D ---> DI(Animations)
    DI --> DIA(Framer Motion)
    DI ---> DIB(React Spring)
    DI --> DIC(React Transition Group)
    D ---> DJ(Charts)
    DJ --> DJA(Recharts)
    DJ --> DJC(React Chart JS)
```
